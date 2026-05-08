import random
print("Nieparzyste cyferki")
licznik = 0
while licznik < 10:
        #wylosuj liczbę
        liczba = random.randint(1,999)
        if int(liczba / 2) == liczba /2:
                #jeśli parzysta to olewamy i wracamy na start
                print("\t", int(liczba/2))
                continue
        #W innym razie lecimy dalej
        print(liczba)
        #dodajemy +1 do pętli
        licznik += 1
print("Domykamy")
