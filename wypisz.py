def wypisz1(lista1):
        x=0
        while x<=len(lista1)-1:
                if x==(len(lista1)-1):
                        #ostatni element
                        print("and "+lista1[x])
                        x+=1
                else:
                        #dodaj słowo
                        print(lista1[x]+", ")
                        x+=1
def wypisz2(lista2):
        #licznik do pętli
        i=0
        #pusty string do zapisu
        zwrotna=""
        while i<=len(lista2)-1:
                if i<len(lista2)-1:
                        #dodaj słowo
                        zwrotna=(zwrotna+lista2[i]+", ")
                        i+=1
                else:
                        #ostatnie słowo
                        zwrotna=(zwrotna+"and "+lista2[i])
                        #wypisz wynik
                        print(zwrotna)
                        i+=1
def wypiszObie(listaObie):
        wypisz1(listaObie)
        wypisz2(listaObie)
listaMain = ["apples", "bananas", "tofu", "cats"]
listaDruga = ["klawiatura", "mysz", "słuchawki", "telefon", "kubek"]
wypiszObie(listaMain)
wypiszObie(listaDruga)
