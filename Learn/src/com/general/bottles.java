package com.general;

public class bottles {
	public static void main(String [] args){
			odlicz(100);
		}
	public static void odlicz(int b){
		if (b==0) {
			System.out.println("Nie ma butelek piwa na regale,\nNie ma butelek piwa,\nNie mozesz wziazc ani jednej, nie mozesz podac jej dalej,\nBo nie ma juz wiecej butelek piwa na regale!");
		} else {
			System.out.println(b+" butelek piwa na regale,\n"+b+" butelek piwa,\nWez jedna, podaj ja dalej");
			odlicz(b-1);
		}
	}
}
