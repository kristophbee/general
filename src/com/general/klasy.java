package com.general;
public class klasy {
	//wartości
	public String opis;
	public char kolorek;
	public double cena;

	//konstruktor, nie działa
		public void Shirt(){
			opis = "--łopis panie--";
			kolorek = 'U';
			cena = 0.00;
//			display();	//normalne wywołanko
//klasy.java:12: error: cannot find symbol
//			display();	//normalne wywołanko
//			^


//			this.display();	//wywołanko poprzez this(?!)
//klasy.java:13: error: cannot find symbol
//			this.display();	//wywołanko poprzez this(?!)
//			    ^
		}

	public static void main (String[] args) {
//		też nie działa
//			Shirt myShirt = new Shirt();
//			myShirt.display();
		//myShirt to zmienna referencyjna, display to metoda. Kropeczka operacyjna :P
//  symbol:   method display()
//  location: class klasy
//klasy.java:22: error: cannot find symbol
//			myShirt.display();
//			^
//			Shirt myShirt = new Shirt();
//			^
//  symbol:   class Shirt
//  location: class klasy
//klasy.java:21: error: cannot find symbol
//			Shirt myShirt = new Shirt();
//			                    ^
//  symbol:   class Shirt
			int x = 0;
			String s = "ABC"+x;
			String s2 = s + x + s.substring(1)+"FGH";
			String s3 = 1 + 1 + "ABC";
			System.out.print(s + " " + s2 + " " + s3);
	}//kuniec maina
}//konon tu mieszka
