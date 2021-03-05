package com.general;
import java.util.Scanner;

public class fahren {
	public static void main(String[] args) {
		double fht, celsius;
		Scanner in = new Scanner(System.in);
		System.out.println("Ile w Fahrenheit?");
		fht = in.nextDouble();
		celsius = (fht-32)*5/9;
		System.out.printf("%.1f F = %.1f C\n",fht,celsius);
	}
}
