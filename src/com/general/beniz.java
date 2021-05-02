package com.general;
public class beniz {
	public static void main(String args[]){

		StringBuilder spurdo = new StringBuilder("hello");
		System.out.println("Spurdo says: " +spurdo);
		spurdo.append(" world");
		System.out.println("Spurdo says: " +spurdo);

		spurdo.append("!").append(" are").append(" you?");
		System.out.println("Spurdo says: " +spurdo);

		spurdo.insert(12, " How");
		System.out.println("Spurdo says: " +spurdo);

		//get length
		System.out.println("Spurdos length: " +spurdo.length());

		//get SubString
		System.out.println("Spurdo sub: " +spurdo.substring(0,5));
	}
}
