package com.general;

public class liczonko{

	public static boolean isDivisible(int x, int y) {
		return (x%y==0);
	}

	public static boolean isTriangle(int a, int b, int c){
		if ((a>=b) && (a>=c)){
			return (b+c>=a);
		} else if ((b>=a) && (b>=c)){
			return (a+c>=b);
		} else if ((c>=a) && (c>=b)){
			return (a+b>=c);
		} else {
			return true;
		}
	}

	public static void main (String [] args){
		System.out.println(isDivisible(4,2));
		System.out.println(isDivisible(5,3));
		System.out.println(isTriangle(1,2,4));
		System.out.println(isTriangle(6,6,6));

	}
}
