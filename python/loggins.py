import logging
logging.basicConfig(filename="debug.log", level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')
logging.debug("Start of program")
def fucktorial(n):
        logging.debug("Start of fucktorial(%s)"%(n))
        total=1
        for i in range (1, n+1):
                total *=i
                logging.debug("i is "+str(i)+", total is "+str(total))
        logging.debug("End of fucktorial(%s)"%(n))
        return total
print(fucktorial(5))
logging.debug("End of program")
