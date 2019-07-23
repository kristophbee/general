package com.general;
public class hello {
	//deklaracja statycznej wartości. Może być w dowolnym miejscu programu.
	static String helloMessage;
	public static void main(String[] args) {
		//wersja biedowa
		//System.out.println("Hello world");
		helloMessage="Hello World!";
		System.out.println(helloMessage);
	}
}
