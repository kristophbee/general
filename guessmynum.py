import random
solved = False
tries =1
number = random.randint(0,10)
while solved==False:
        print("Try "+str(tries)+". Take a guess.")
        resp = input()
        try:#test na debila
                val=int(resp)#konwersja do inta
                if int(resp)==number:#zgadza sie
                        solved=True
                        print("You guessed it! And it took you "+str(tries)+" guesses.")
                elif int(resp) < number:
                        print(resp+" is too low. Try higher.")
                        tries+=1
                elif int(resp) > number:
                        print(resp+" is too high. Try lower.")
                        tries+=1
                else:#na wszelki powrót do początku
                        print("Oops")
                        tries+=1
        except ValueError:#pułapka na heheszków
                print("Very funny. Try again.")
                tries+=1