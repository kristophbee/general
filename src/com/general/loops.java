package com.general;
public class loops {
	static final int KONSTANT = 3; 
	public static void main(String[] args) {
		int height = 4, width = 10;//rozmiar tebeli
		for(int row = 0; row < height; row++){//pentla z rowami
			for(int col = 0; col < width; col++){//pentla z kolumnami
				System.out.print("@");//piszemy!
			}//rząd zapisany
			System.out.println();//zaginamy linię
		}
		height = 10;
		while (height < 20){//sprawdź najpierw, więc pierwszy raz może nie zakręcić
			System.out.print("value of x: "+height);
			height++;
			System.out.print("\n");
		}
		do {
			System.out.print("value of x: " +height);
			height--;
			System.out.print("\n");
		}while (height>10);//sprawdź warunek później, czyli zakręci conajmniej raz
		for(int i = 0; i < 9; i++){//najlepiej
			System.out.println("i: "+i);
		}
	}//pierwszy kuniec
}//ogólny kuniec
