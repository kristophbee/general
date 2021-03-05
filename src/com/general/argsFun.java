package com.general;

public class argsFun {
// java -Dhero0="Wonderwoman" -Dhero1="Arrow" argsFun Superman Batman Aquaman 
	public static void main(String[] args) {
		System.out.println("Let me put your args for you:");
		System.out.println("Arg0: "+args[0]);
		System.out.println("Arg1: "+args[1]);
		System.out.println("Arg2: "+args[2]);
		String hero0=System.getProperty("hero0");
		String hero1=System.getProperty("hero1");
		System.out.println("Hero0: "+hero0);
		System.out.println("Hero1: "+hero1);
}	}