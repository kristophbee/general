package com.general;
import java.util.Arrays;
import java.util.Random;

public class arrays {

	public static void pluj (String val){
		System.out.print(val);
	}
	public static int stat(int [] taba, int low, int high){
		int licz=0;
		for (int it=0; it<taba.length; it++){
			if (taba[it] >= low && taba[it] < high){
				licz++;
			}
		}
		return licz;
	} 

	public static void tabsdisp(int [] tabsa){
		for (int a=0; a<tabsa.length; a++){
			if (tabsa[a]==0){
				continue;
			}
			pluj("\n"+a+"\t"+tabsa[a]);
		}
	}
	public static void histogram(int[] oceny, int wwln){
		for ( int ptla : oceny){
		//for (@SuppressWarnings("unused") int ptla : oceny){
			//if(oceny[ptla]==wwln){
				pluj(oceny+"\n");
			//}
		}
	}

	public static double[] powArray(double[] source) {
		double outArray[] = new double [42];
		//Skrócony zapis = rak
		//for(double tmp1 : outArray) {
		//		outArray[(int)tmp1]=source[(int)tmp1]*source[(int)tmp1];
		//}
		for(double tmp1=0; tmp1<source.length;tmp1++){
			outArray[(int)tmp1]=source[(int)tmp1]*source[(int)tmp1];
		}
		return outArray;
	}
	
	public static void main(String args[]){

		String[] names = new String [3];

		names[0] = "Blue Shirt";
		names[1] = "Red Shirt";
		names[2] = "Black Shirt";

		int[] numbers = {100, 200, 300};

		for (String name:names){
			System.out.println("Name:\t"+name);
		}

		for(int number:numbers){
			System.out.println("Number:\t"+number);
		}
		int size=3;//do zmiennej tabelki poniżej
		int[] counts = new int[4];
		//@SuppressWarnings("unused")
		double[] values = new double[size];

		counts[0] = 7;
		counts[1] = counts [0] * 2;
		counts[2]++;
		counts[3] -=60;

		int i=0;
		while (i<4){
			System.out.print(counts[i]+" ");
			i++;
		}
		pluj("\n"+counts);
		pluj("\n Orginał:\t"+Arrays.toString(counts));
		//odwołanie do tej samej tablicy:
		//@SuppressWarnings("unused")
		int[] b = counts;
		//kopia niezależna tablicy
		int[] copia = new int [4];
		//wklejamy dane ze starej do nowej:
		for(i=0;i<4;i++){
			copia[i] = counts [i];
		}
		//metoda z biblioteki Javy
		int [] dCopia = Arrays.copyOf(counts,4);
		pluj("\n Reference:\t"+Arrays.toString(copia));
		pluj("\n Kopia:\t\t"+Arrays.toString(dCopia));
		pluj("\nZmieniamy drugą wartość w tablicy:");
		counts[2]=(int)(Math.random()*100);
		pluj("\n Orginał:\t"+Arrays.toString(counts));
		pluj("\n Reference:\t"+Arrays.toString(copia));
		pluj("\n Kopia:\t\t"+Arrays.toString(dCopia));
		pluj("\nZmieniamy trzecią warość w copii");
		copia[3]=(int)(Math.random()*100);
		pluj("\n Orginał:\t"+Arrays.toString(counts));
		pluj("\n Reference:\t"+Arrays.toString(copia));
		pluj("\n Kopia:\t\t"+Arrays.toString(dCopia));
		pluj("\nZmieniamy zerową wartość w drugiej kopii");
		dCopia[0]=(int)(Math.random()*100);
		pluj("\n Orginał:\t"+Arrays.toString(counts));
		pluj("\n Reference:\t"+Arrays.toString(copia));
		pluj("\n Kopia:\t\t"+Arrays.toString(dCopia));
		Random radom = new Random();
		int [] sradom = new int [30];
		for(i=0; i<sradom.length;i++){
			sradom[i]=radom.nextInt(100);
		}
		pluj("\n\n"+Arrays.toString(sradom));
		//printArray(sradom);
		//Dzielimy sradoma na histogram
		pluj("\n\n0-33:\t"+stat(sradom,0,33));
		pluj("\n34-67:\t"+stat(sradom,34,67));
		pluj("\n68-100:\t"+stat(sradom,68,100));
		//szczegółowiej
		int [] liczone = new int [100];
		for (i=0;i<liczone.length;i++){
			liczone[i] = stat(sradom,i,i+1);
			//if (liczone[i]!=0){
			//	pluj("\n"+i+"\t"+liczone[i]);
			//}
		}
		//wydajniej
		pluj("\n=============================\n");
		int [] liczone2 = new int [100];
		for (i=0; i<sradom.length;i++){
			int indeks = sradom[i];
			liczone2[indeks]++;
			//pluj("\n"+i+"\t"+liczone2[i]);
		}
		//pluj("\n"+Arrays.toString(liczone2)+"\n");
		pluj("Wynik\tPierw\tDruga\tMatch");
		for(i=0;i<liczone.length;i++){
			if (liczone[i]==0 || liczone2[i]==0){
				continue;
			}
			pluj("\n"+i+"\t"+liczone[i]+"\t"+liczone2[i]+"\t"+(liczone[i]==liczone2[i]));
		}
		pluj("\n");
		//skrócony zapis
		for(int value : sradom) {
			pluj(value+"\t");
		}
		int[] liczone3 = new int[100];
		for (int score : sradom){
			liczone3[score]++;
		}
		tabsdisp(liczone3);
		pluj("\n");
		double[] dubelek = new double[42];
		//Jebać skrócony zapis
		//for (double valu : dubelek){
		//	dubelek[(int) valu]=radom.nextDouble()*10;
			//pluj(dubelek[(int) valu]+"\t");		
		//}
		for(double val=0; val<dubelek.length;val++){
			dubelek[(int) val]=radom.nextDouble()*10;
		}
		double[] powahArray =  powArray(dubelek);
		//drań zwraca zero dla pierwszej i te same dla kolejnych
		//for (double valu2 : dubelek){
			//pluj("\n"+dubelek[(int)valu2]+"\t");
			//pluj(powahArray[(int)valu2]+"");
		//}
		pluj("\n=============================\n");
		for(i=0;i<dubelek.length;i++){
			pluj("\n"+i+"\t"+dubelek[i]+"\t\t"+powahArray[i]);
		}
		pluj("\n\n");
		histogram(liczone,1);
	}
}// test
