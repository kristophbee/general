import random
age = 31
if age < 21:
	beverage = "milk"
elif age >= 21 and age < 80:
	beverage = "beer"
else:
	beverage = "prune juice"
print("Have a " + beverage)
for x in ["The", "rain", "in", "Spain"]:
	print(x)
print("Done")
counter =65
while counter < 91:
	print(str(counter) + "=" +  chr(counter))
	counter +=1
print("Alles")
print("Numbers that aren't evenly divisible by 5")
counter = 0
while counter < 10:
	# Get a random number
	number = random.randint(1,999)
	if int(number / 5) == number / 5:
		# If it's evenly divisible by 5, bail out.
		break    # Otherwise, print it and keep going for a while.
	print(number)
	# Increment the loop counter.
	counter += 1
print("Loop is done")
menele = ["Janusz", "Zenek", "Julian", "Pioter"]
#Czy Andrzej jest menelem?
if "Andrzej" in menele:
	print("Andrzej jest menelem")
else:
	print("Andrzej jest spoko")
print(menele)
print(len(menele))#ilu meneli?
menele.append("Mietek")#Mietek joins the party
print(menele)
print(len(menele))
menele.insert(0,"Kenek")#Kenek dobija na front
print(menele)
print(len(menele))
menele[3] = "Roman"#Roman wbija przed podium
print(menele)
print(len(menele))
lumpy = ["Ferdek", "Damian", "Edek", "Czesio"]
print(lumpy)
lumpy.extend(menele)#Fuzja i synergia lokalnych bezdomych
print(lumpy)
lumpy.remove("Zenek")#Zenek pali wroty
print(lumpy)
lumpy.pop(3)#Czwarty pali wroty
print(lumpy)
wywalony1 = lumpy.pop(2)
wywalony2 = lumpy.pop()
print(wywalony1 + " i " + wywalony2 + " poszli wypierdalac...")
print(lumpy)
del lumpy[3]#kasacja spod podium
print(lumpy)
del menele #kasujemy konkurencje
# print(menele) wywala teraz krytyka
lumpy.clear()#Wszystkich zabiera suka
print(lumpy)
lyterki = ["A","B","C","D","A","B","C","D"]
print(lyterki.count("C"))#ile razy C jest w tabeli?

