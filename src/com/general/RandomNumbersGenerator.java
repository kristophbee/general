package com.general;

import java.util.Scanner;

public class RandomNumbersGenerator {

	public static void main(String[] args) {
		int amount, line=0;
		boolean checkInt=true;
		Scanner input  = new Scanner(System.in);
		while(checkInt) {
			System.out.print("How many random numbers do you need? ");
			try {
				String consInput;
				consInput = input.nextLine();
				amount = Integer.parseInt(consInput);
				checkInt=false;
			} catch (Exception e) {
				System.out.println("Only integers are allowed.");
				continue;
			}
			input.close();
			for(; amount>0; amount--) {
				System.out.print((int)(Math.random()*10)+" ");
				line++;
				//TwelveDaysOfPayday.delayText(1);
				if (line%25==0) {
					System.out.print("\n");
}	}	}	}	}