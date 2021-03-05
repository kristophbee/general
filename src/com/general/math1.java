package com.general;
public class math1 {

	public static boolean isDivisible(int x, int y){
		return (x%y==0);
	}

	public static void main(String[] args) {

		// array czyli tabela
		String [] items= {"shirt","trousers","scarf"};

		// multistep array
		int [] ages = new int[3];
		ages [0] = 19;
		ages [1] = 34;
		ages [2] = 92;
		System.out.println("Item 1 " + items[0]);
		System.out.println("Długość tabeli ages to " + ages.length);

		// pętla z breakiem
		int passmark = 12;
		boolean passed=false;
		int [] scores={4,6,8,12,35};
		for (int unitscore:scores){
			if (unitscore >=passmark){
				passed=true;
				break;
			}
		}
		System.out.println("At least one passed? " + passed);

		// stringi
		String mystring = "Hello";
		System.out.println(mystring);
		mystring = mystring.concat(" World");
		System.out.println(mystring);
		mystring=mystring+"!";
		System.out.println(mystring);

		// dzielenie z resztą
		System.out.println("Dzielenie z resztą 16%5=" + 16%5);

		// przypisywanie finalnej wartości
		int a=6, b=2;
		System.out.println(a +" += " + b + " = " + (a+=b));
		System.out.println(a +" -= " + b + " = " + (a-=b));
		System.out.println(a +" *= " + b + " = " + (a*=b));
		System.out.println(a +" /= " + b + " = " + (a/=b));
		System.out.println(a +" %= " + b + " = " + (a%=b));

		// inkrementacja i dekrementacja
		a=6;
		b=7;
		a=++b;
		System.out.println("Preinkrementacja " + a  + " " + b);
		a=6;
		b=7;
		a=b++;
		System.out.println("Postinkrementacja " + a  + " " + b);
		a=6;
		b=7;
		a=--b;
		System.out.println("Predekrementacja " + a  + " " + b);
		a=6;
		b=7;
		a=b--;
		System.out.println("Postdekrementacja " + a  + " " + b);

		// lepszy przykład
		int count=15, c, d;
		a = count++;
		b = count;
		c = ++count;
		d = count;
		System.out.println(a + ", " + b  + ", " + c + ", " + d);

		// promocje *Janusz intensifies*
		a = 55555;
		b = 66666;
		long wynik;
		long drugi = 66666;

		// padaka jeśli oba czynniki mają za wąski zakres :(
		wynik = a * b;
		System.out.println("Operacja na intach, wynik w longu");
		System.out.println(a +" * " + b  + " = " + wynik);

		// rozwiązanko, dajesz jeden czynnik w longu :)
		wynik = a * drugi;
		System.out.println("Operacja na incie i longu, wynik w longu");
		System.out.println(a +" * " + drugi  + " = " + wynik);

		// to samo dla dzielenia
		a = 7;
		b = 2;
		double dwuja;
		double dzielnik = 2;
		dwuja = a/b;
		System.out.println("Dzielenie na integerach, wynik w doblu");
		System.out.println(a +" / " + b  + " = " + dwuja);
		dwuja = a/dzielnik;
		System.out.println("Dzielenie na incie i dublu, wynik w doblu");
		System.out.println(a +" / " + dzielnik  + " = " + dwuja);

		// type casting czyli zmiana na biedniejsze tajpy
		int longToInt = (int)20L;
		short doubleToShort = (short)3.0;
		System.out.println(longToInt + " " + doubleToShort);

		// jako int użyjemy a z poprzednich przykładów
		drugi = 123987654321L;
		a = (int) (drugi); // numer ścięty do inta
		System.out.println(drugi + " ścięty do inta " + a);

		// zależy od wartości
		drugi=99L;
		a = (int) (drugi); // numer ścięty do inta
		System.out.println(drugi + " ścięty do inta " + a);

		// strata wartości po przecinku przy zmianę na int
		dwuja = 51.9;
		a = (int) (dwuja);//utnie dziesiątki
		System.out.println(dwuja + " ścięty do inta " + a);

		// problemy z downsizingiem
		a = 53;
		b = 47;
		byte bajtel;
		// dodawanie a + b = bajtel wywali kompilator, lepiej użyć:
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		// metoda castingowa
		bajtel = (byte) (a+b);//bez utraty! Type Casting w akcji
		System.out.println(a + " + " + b + " = " + bajtel);

		//problemy z promocją
		short x, y, z;
		x = 1;//x dostaje awans do inta
		y = 2;//y dostaje awans do inta
		//z = x + y wywala kompliator
		//można zadeklarować z jako int albo:
		z = (short)(x+y);
		System.out.println(z);
		//maszyna do liczenia starości
		int ageDays = ages[1] * 365;
		long ageSeconds = ages[1] * 365 * 24L * 60 * 60;//24L oznacza promo do longa
		System.out.println("Masz " + ageDays+ " dni. To jakieś " + ageSeconds + " sekund.");
		//to nie koniec, jak dodasz stałe inty z flotem też będzie kaszanka
		// int wynikjeden = 1 + 2 + 3 + 4.0;
		// int wynikdwa = (1 + 2 + 3 + 4) * 1.0;
		//możliwe rozwiązania
		double wynikjeden = 1 + 2 + 3 + 4.0;
		double wynikdwa = (1 + 2 + 3 + 4) * 1.0;
		System.out.println(wynikjeden + " " + wynikdwa);
		//możesz też zrobić casta
		int wynikIntJeden = (int)(1+2+3+4.0);
		int wynikIntDrugi = (int)((1+2+3+4)*1.0);
		System.out.println(wynikIntJeden + " " + wynikIntDrugi);
		//podobna kupa z flotem
		//float float1 = 27.9;
		//dopisz F żeby kompilator się odpierdolił:
		float float1 = 27.9F;
		//albo zakastuj mendę:
		float floatCast = (float)27.9;
		System.out.println(float1 + " " + floatCast);
		//przykładowy program
		drugi = 99_000_000_000L;
		float1 = 13.5F;
		//@SuppressWarnings("unused")
		char ch1 = 'U';
		System.out.println("long: " + drugi);
		//long do inta
		a = (int)drugi;
		System.out.println("Long zmieniony na inta: " + a);
		System.out.println(isDivisible(4,2));
		System.out.println(isDivisible(6,4));		
// kuniec
	}
}
