import random
guessed = False
maxVal =100
minVal =0
tries =0
resp =random.randint(minVal,maxVal)
print("The number is "+str(resp)+".")
while guessed == False:
        aiguess = random.randint(minVal,maxVal)
        if aiguess == int(resp):
                print("Its "+str(aiguess)+"! And I guessed it in "+str(tries)+" tries!")
                guessed = True
        elif aiguess < int(resp):
                print(str(aiguess)+" is too low.")
                minVal = aiguess+1
                tries+=1
        elif aiguess > int(resp):
                print(str(aiguess)+" is too high.")
                maxVal = aiguess-1
                tries+=1
        else:
                print("Oops")
                break
