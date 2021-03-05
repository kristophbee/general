package com.general;

public class pyntla {
	public static void main (String[] args) {
		loop(10);
		loop(666);
		loop(2137);
		sqbeniz(16);
		System.out.println(potynga(2,2));
		System.out.println(fucktorial(3));
		System.out.println(myexp(7));
		System.out.println(Math.exp(7));
	}
	public static void loop(int n){
		int i = n;
		while (i > 1) {
			System.out.print(i+" ");
			if (i % 2 == 0){
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
		System.out.print("\n");
	}
	public static double sqbeniz(double k){
		double xn=k/2;
		double wynik=k, poprz=0;
		while (Math.abs(wynik-poprz)>0.0001){
			poprz=wynik;
			wynik=((xn+wynik/xn)/2);
			System.out.print(wynik+" ");
		}
	System.out.print("\n");
	return wynik;
	}
	public static double potynga(double l,double p) {
		double sp=1;
		for(int i=1;i<=p;i++){
			sp=l*sp;
		}
		return sp;
	}
	public static int fucktorial (double liczba) {
		int wynik=1;
		for (int i=1;i<=liczba;i++){
			wynik=wynik*i;
		}
	return wynik;
	}
	public static double myexp (double x) {
		double expreslt;
			if (x==0){
				return 1;
			} else {
				expreslt=fucktorial(x)+x+potynga(x,x+1)/myexp(x-1);
				System.out.print(expreslt+" ");
				return expreslt;
			}
	}
}
