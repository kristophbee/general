for x in range(7):
        print(x)
print("kuniec")
for y in range(1,10):
        print(y)
print("znowu kuniec")
for z in "snorkel":
        print(z)
print("No i znowu kuniec")
slowo1="Piździelec"
for a in slowo1:
        print(a)
print("Ano")
for b in ["Tiruriru", "paczka", "żwiru"]:
        print(b)
print("Cyk")
answers = ["A", "C", "B", "D"]
for answer in answers:
        if answer == "":
                print("Incomplete")
                break
        print(answer)
print("Loop is done")
answers2 = ["A", "C", "", "D"]
for answer2 in answers2:
        if answer2 == "":
                print("Incomplete")
                break
        print(answer2)
print("Loop is done")
for answer3 in answers2:
        if answer3 == "":
                print("Kakao")
                continue
        print(answer3)
print("Kuniec pyntli kontinu")
licznik=65
while licznik < 91:
        print(str(licznik)+" to " +chr(licznik))
        licznik+=1
print("I cyk pętelka")
