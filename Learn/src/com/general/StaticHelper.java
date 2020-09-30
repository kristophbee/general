package com.general;
import java.time.LocalDate;

public class StaticHelper {
	public static void printMessage(String message) {
	System.out.println("Message for " + LocalDate.now() + ": " +message);
	}
	public static int fibonacci(int n) { 
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static long factorial(long input) {
		long result = 0;
		if ( input < 2) {
			return input;
		}
		result=((input) * factorial(input - 1));
		return result;
	}
	public static void main(String[] args) {      
		System.out.println("This is StaticHelper");
		long a=4;
		System.out.println(a+"! is "+StaticHelper.factorial(a));
	}
}

