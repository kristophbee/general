package com.general;
public class time {
	public static void main(String[] args){
		int doba=24*60*60, godzina=14, minuta=39, sekunda=37;
		//System.out.println(doba);
		double czas=(godzina*3600)+(minuta*60)+sekunda;
		//System.out.println(czas);
		double passed=(czas/doba)*100;
		//System.out.println(passed);
		System.out.println("Jest "+godzina+":"+minuta+":"+sekunda+" co oznacza ze zmarnowales "+passed+"% doby");
		int obgodz=16, obmin=45, obsek=33;
		//double minionyCzas=(obgodz*3600)+(obmin*60)+obsek;
		int zgodz=0, zmin=0, zsek=0;
		if (obsek>sekunda){
			zsek=obsek-sekunda;
		} else {
			zmin=zmin-1;
			zsek=sekunda-obsek;
		}
		if (obmin>minuta){
			zmin=obmin-minuta+zmin;
		} else {
			zgodz=zgodz-1;
			zmin=minuta-obmin+zmin;
		}
		zgodz=obgodz-godzina+zgodz;
		System.out.println("To cwiczenie zajelo Ci "+zgodz+" godz, "+zmin+" min i "+zsek+" sek. Brawo Ty.");
	}
}
