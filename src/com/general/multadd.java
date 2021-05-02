package com.general;

public class multadd {

	public static double Multadd (double a, double b, double c) {
		return(a*b+c);
	}

	public static int ack (int m, int n) {
		if (m==0){
			return n+1;
		} else if (m>0 && n==0){
			return (ack(m-1,1));
		} else if (m>0 && n>0) {
			return (ack(m-1,ack(m,n-1)));
		} else {
			return 0;
		}
	}

	public static double powah (double x, int n) {
		if (n==0){
			return 1;
		} else if (x%2==0) {
			return (powah(powah(x,n/2),2));
		} else {
			return (x*powah(x,n-1));
		}
	}

	public static void main(String [] args){
	System.out.println(Multadd(1,2,3));
	double a=Math.sin(3.14), b=0.25, c=(Math.cos(3.14/4)/2);
	System.out.println(Multadd(a,b,c));
	int x=0,y=0;
	double d=0;
	while (x<4){
		while(y<4){
			System.out.println(ack(x,y)+" "+powah(d,y));
			y++;
			}
		x++;
		d++;
		y=0;
		}
	}
}

