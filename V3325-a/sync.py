import sys
import os
import logging
import hashlib
import shutil
import time

# 1. source path
# 2. replica path
# 3. interval time
# 4. number of intervals to keep
# 5. path to log file

# Function to compute the checksum of a file
def compute_checksum(file_path):
    hash_md5 = hashlib.md5()
    with open(file_path, "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
    return hash_md5.hexdigest()

# Scan the source directory and build a dictionary of files with their checksums
def scan_directory(path):
    file_dict = {}
    for root, dirs, files in os.walk(path):
        for file in files:
            full_path = os.path.join(root, file)
            rel_path = os.path.relpath(full_path, path)
            checksum = compute_checksum(full_path)
            file_dict[rel_path] = checksum
    return file_dict

# Sync the source directory to the replica directory
def sync_directories(source, replica):
    source_files = scan_directory(source)
    replica_files = scan_directory(replica)

    # Copy new and modified files from source to replica
    for rel_path, checksum in source_files.items():
        source_file = os.path.join(source, rel_path)
        replica_file = os.path.join(replica, rel_path)

        if rel_path not in replica_files or replica_files[rel_path] != checksum:
            os.makedirs(os.path.dirname(replica_file), exist_ok=True)
            shutil.copy2(source_file, replica_file)
            logging.info(f"Copied/Updated: {rel_path}")

    # Remove files from replica that are not in source
    for rel_path in replica_files.keys():
        if rel_path not in source_files:
            replica_file = os.path.join(replica, rel_path)
            os.remove(replica_file)
            logging.info(f"Removed: {rel_path}")
            # Remove empty directories
            dir_path = os.path.dirname(replica_file)
            while dir_path != replica and not os.listdir(dir_path):
                os.rmdir(dir_path)
                dir_path = os.path.dirname(dir_path)
                logging.info(f"Removed empty directory: {dir_path}")

#main call
def main(original=sys.argv[1], replica=sys.argv[2], interval=int(sys.argv[3]), num_intervals=int(sys.argv[4]), logfile=sys.argv[5]):
    logging.basicConfig(filename=logfile, level=logging.INFO, format='%(asctime)s - %(message)s')
    logging.info("Starting synchronization process")
    try:
        while num_intervals > 0:
            sync_directories(original, replica)
            logging.info("Synchronization complete. Waiting for next interval.")
            num_intervals -= 1
            time.sleep(interval)
    except KeyboardInterrupt:
        logging.info("Synchronization process terminated by user.")