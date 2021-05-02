package com.general;

public class recursive {

	public static long fibonacci(long n) {
		if (n<2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		long n = (long)(Math.random()*10);
		System.out.println("F("+n+") = "+recursive.fibonacci(n));
	}
}
