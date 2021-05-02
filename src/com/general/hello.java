package com.general;

import static java.lang.System.*;

public class hello {
	//deklaracja statycznej wartości. Może być w dowolnym miejscu programu.
	static String helloMessage;
	public static void main(String[] args) {
		//wersja biedowa
		//System.out.println("Hello world");
		helloMessage="Hello World!";
		out.println(helloMessage);
		int drugiNumer = 12, trzeciNumer = 6, suma = drugiNumer + trzeciNumer;
		out.println(suma);
		int minIntValue = Integer.MIN_VALUE, maxIntValue = Integer.MAX_VALUE;
		out.println("Integer occupies 32bits and has a length of 32\n" +
				"Min value is " + minIntValue + "\nMax value is "+ maxIntValue);
		out.println("BUSTED Min value is " + (minIntValue-1) + "\n" +
				"BUSTED Max value is " + (maxIntValue+1));
		byte minByteVal = Byte.MIN_VALUE, maxByteVal = Byte.MAX_VALUE;
		out.println("Byte occupies 8 bits and has a length of 8\n" +
				"Min value " + minByteVal +"\nMax value "+ maxByteVal);
		short minshortVal = Short.MIN_VALUE, maxshortVal = Short.MAX_VALUE;
		out.println("Short occupies 16 bits and has a length of 16\n" +
				"Min value " + minshortVal +"\nMax value "+ maxshortVal);
		long dlugiVal = 2_147_483_647_234L;
		//Dodajesz L na końcu aby pokazać że to long a nie int!
		long minlongVal = Long.MIN_VALUE, maxlongVal = Long.MAX_VALUE;
		out.println("Long\nMin value "+minlongVal+"\nMax value "+maxlongVal);
		out.println(dlugiVal);
		suma = (minIntValue / 2);
		byte nowyBajt = (byte)(minByteVal/2);
		short nowySzort = (short) (minshortVal/2);
		out.println(suma +" "+ nowyBajt + " " + nowySzort);
	}
}