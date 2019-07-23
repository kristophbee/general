package com.general;
public class simple {
	public static void main(String args[]){
		boolean kejs;
		char a1='A', a2='a';
		kejs = a1 > a2;//false, smaller is bigger
		//String b1="B", b2="b";
		System.out.println(kejs);
		//kejs = b1 > b2;//działania porównawcze nie banglają dla Stringów. Zobiektować?
		//System.out.println(kejs);
	}
}
