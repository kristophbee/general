krotka1 = 1, 42, 12, -4
#inny sposób zrobienia krotki(ang tuple)
krotka2 = (2, 43, 13, -4)
#Jeśli wartości są stałe należy zastosować krotkę
print(krotka1)
print(krotka2)
#Słowniki riki tiki - unikatowe elementy
ajkiu = {5: "debil",500:"Dzinius"}
print(ajkiu[5])
#Ściąga
#Rodzaj  el. unikalne|kolejność|zm. konkr. elem.|Nowe elementy
#lista   NIE            TAK         TAK            TAK
#krotka  NIE            TAK         NIE            NIE
#słownik TAK            NIE         TAK            TAK
#zbiór   TAK            NIE         NIE            TAK
zbior1 = {1,4,20,-4,20}#elementy muszą być unikatowe
print(zbior1)#zbiór ang set
lista1 = [1,4,20,-4,20]#przykładowa lista do konwersji
print(lista1)
print(set(lista1))#konwersja listy do zbioru
zbior2 = {2, 1, 25, 40, 20}
print(zbior1)
print(zbior2)
print(zbior1-zbior2)#wszystko z jedynki nie pokrywające się z 2
print(zbior1&zbior2)#elementy wspólne
print(zbior1^zbior2)#xor, alt wykluczająca, wszystko co rózne 
print(zbior1|zbior2)#wszystko z obu
print(zbior1.issubset(zbior2))#czy 1 jest podzbiorem 2?
#Moszna zagniezdzać typy danych
listaZdzisi = [#lista
               ("Marek",23,"Facio"),#zagnieżdżone krotki
               ("Darek",29,"Facio"),
               ("Klotylda",63,"Kobitka")
]
print(listaZdzisi)
listaZdzisi.append(("Genowefa",66,"Kobitka"))#dodajmy gościa
print(listaZdzisi)
zbiorZdzisi = {#secik
               ("Marek",23,"Facio"),#zagnieżdżone krotki
               ("Darek",29,"Facio"),
               ("Klotylda",63,"Kobitka")
}#zbiór pozwala na unikalne wartości, chędozyc duplikaty :)
print(zbiorZdzisi)
zbiorZdzisi.add(("Genowefa",66,"Kobitka"))
print(zbiorZdzisi)#marna metoda, moze jaka pętelka?
for imie, wiek, plec in listaZdzisi:
   print("Imię:\t",imie)
   print("Wiek:\t",wiek)
   print("Płeć:\t",plec)
   print()