import sys
import os
import logging
import hashlib
import shutil
import time

# Function to compute the checksum of a file
def compute_checksum(file_path):
    logging.debug("Computing checksum for"+str(file_path))
    hash_md5 = hashlib.md5()
    with open(file_path, "rb") as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_md5.update(chunk)
            logging.debug("Read chunk of size "+str(len(chunk)))
    return hash_md5.hexdigest()

# Scan the source directory and build a dictionary of files with their checksums
def scan_directory(path):
    logging.debug("Scanning directory "+str(path))
    file_dict = {}
    for root, dirs, files in os.walk(path):
        for file in files:
            full_path = os.path.join(root, file)
            logging.debug("Found file "+str(full_path))
            rel_path = os.path.relpath(full_path, path)
            logging.debug("Relative path: "+str(rel_path))
            checksum = compute_checksum(full_path)
            logging.debug("Checksum for "+str(rel_path)+": "+str(checksum))
            file_dict[rel_path] = checksum
    return file_dict

# Sync the source directory to the replica directory
def sync_directories(source, replica):
    logging.debug("Syncing from "+str(source)+" to "+str(replica))
    source_files = scan_directory(source)
    logging.debug("Source files: "+str(source_files))
    replica_files = scan_directory(replica)
    logging.debug("Replica files: "+str(replica_files))

    # Copy new and modified files from source to replica
    for rel_path, checksum in source_files.items():
        source_file = os.path.join(source, rel_path)
        logging.debug("Processing file "+str(source_file))
        replica_file = os.path.join(replica, rel_path)
        logging.debug("Corresponding replica file "+str(replica_file))

        if rel_path not in replica_files or replica_files[rel_path] != checksum:
            logging.debug("File "+str(rel_path)+" is new or modified")
            os.makedirs(os.path.dirname(replica_file), exist_ok=True)
            logging.debug("Copying file to "+str(replica_file))
            shutil.copy2(source_file, replica_file)
            logging.info("Copied/Updated: "+str(rel_path))

    # Remove files from replica that are not in source
    for rel_path in replica_files.keys():
        logging.debug("Checking if "+str(rel_path)+" needs to be removed")
        if rel_path not in source_files:
            replica_file = os.path.join(replica, rel_path)
            os.remove(replica_file)
            logging.info("Removed: "+str(rel_path))
            # Remove empty directories
            dir_path = os.path.dirname(replica_file)
            while dir_path != replica and not os.listdir(dir_path):
                os.rmdir(dir_path)
                dir_path = os.path.dirname(dir_path)
                logging.info("Removed empty directory: "+str(dir_path))

#main call
def main(original=sys.argv[1], replica=sys.argv[2], interval=int(sys.argv[3]), num_intervals=int(sys.argv[4]), logfile=sys.argv[5]):
    logging.debug("Arguments received - original: "+str(original)+", replica: "+str(replica)+", interval: "+str(interval)+", num_intervals: "+str(num_intervals)+", logfile: "+str(logfile))
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

main()