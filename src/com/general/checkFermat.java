package com.general;

public class checkFermat {

	public static void main(String [] args){
		int a,b,c,n;
		a = (int) (Math.random()*100);
		b = (int) (Math.random()*100);
		c = (int) (Math.random()*100);
		n = 10;
		while(n>-1){
			System.out.print("Dla a="+a+" b="+b+" c="+c+" n="+n);
			if (Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n)){
				System.out.println(" zgadza sie.");
				} else {
				System.out.println(" nie dziala");
				}
			--n;
			}
	}
}
