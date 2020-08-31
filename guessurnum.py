import random
validVal=False
guessed=False
maxVal=100#max zakres
minVal=0#min zakres
tries=0
while validVal == False:
        print("Enter a number")
        resp = input()
        try:
                val=int(resp)#zrzut do inta
                if int(resp) < minVal or int(resp) > maxVal:
                        print("Values between "+str(minVal)+" and "+str(maxVal)+" are allowed. Try again.")
                else:
                        validVal=True
        except ValueError:#na wypadek kaplicy z konwersją ze stringa
                print("Very funny. Try again")
while guessed == False:
        aiguess = random.randint(minVal,maxVal)
        if aiguess == int(resp):
                print("Its "+str(aiguess)+"! And it only took me "+str(tries)+" tries!")
                guessed = True
        elif aiguess < int(resp):
                print(str(aiguess)+" is too low.")
                minVal=aiguess+1#redukcja zakresu aby zmniejszyć ilość możliwości
                tries+=1
        elif aiguess > int(resp):
                print(str(aiguess)+" is too high.")
                maxVal=aiguess-1#adaptacja zakresu
                tries+=1
        else:#na wszelki.
                print("Oops")
                break
