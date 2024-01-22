licz=0
suma=0
while licz < 3:
   liczba=(int(input("Dawaj liczbę: ")))
   if (liczba%2==0):
      print(liczba,"+",suma,"=",liczba+suma)
      suma = liczba + suma;
      licz+=1
   else:
      print("Parzystą mordo.")
      continue
print("Suma to",suma)