package com.general;
import java.util.Scanner;

public class convert {
	public static void main(String[] args) {
		double cm;
		int feet, inches, remainder;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
		Scanner in = new Scanner(System.in);

		System.out.println("Ile cm?");
		cm = in.nextDouble();
		inches = (int) (cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d st., %d cali\n",cm,feet,remainder);
	}
}