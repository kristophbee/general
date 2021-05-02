package com.general;
import java.util.Scanner;
public class gra {

	public static void main(String[] args){
		System.out.print("Chcesz zagrać w grę? Wpisz imię: ");
		String imie;
		Scanner input  = new Scanner(System.in);
		imie = input.nextLine();
		input.close();
		System.out.println(imie + "! Przegrałeś grę...");
	}
}
