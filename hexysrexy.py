liczba = 255
print(bin(liczba))
print(oct(liczba))
print(hex(liczba))
print(0b11111111)
print(0o377)
print(0xff)
z = complex(2,-3)
print(z)
print(z.real)
print(z.imag)
#strona 102
#Figura 1-14
s = "Hokus pokus czary mary twoja stara to twój stary"
#Czy jest jakaś małe t w stringu?
print("t" in s)
#Czy jest duże T w stringu?
print("T" in s)
#Czy nie ma dużego T w stringu?
print("T" not in s)
#wywal 15 kresek d rzędu
print("~"*15)
#Wypluj pierwszy znak ze stringa
print(s[0])
#Dawaj znaki między 24 a 28 ze sringa
print(s[24:28])
#Dawaj co trzeci znak zaczynając od 0
print(s[0:48:3])
#Jaki jest najmniejszy znak w stringu?
print(min(s))
#Dawaj najwyższy znak ze stringa
print(max(s))
#który znak to j w tekście?
print(s.index("j"))
#gdzie jest pierwsze małe o w drugiej połowie?
print(s.index("o",24,48))
#Ile razy występuje małe o w tekście?
print(s.count("o"))
#duża litera na każdym słowie
print(s.capitalize())
#policz ilość spacji w stringu
print(s.count(" "))
#znajdź znak w zdaniu
print(s.find("w"))
#czy cały string jest z małej litery?
print(s.islower())
#nie wiem co to robi
print(s.lstrip())
#pozamieniaj capsy
print(s.swapcase())
#utytułuj
print(s.title())
#nakurwiaj kapsem
print(s.upper())