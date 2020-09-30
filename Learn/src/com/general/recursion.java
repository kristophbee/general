package com.general;

public class recursion {

	public static void main(String[] args) {
		int n =(int)(Math.random()*10);
		System.out.print("F("+n+") = "+StaticHelper.fibonacci(n));
	}
}
