package com.general;

import java.util.Scanner;

public class GuessYourNumber {

	public static void main(String[] args) {
		boolean asshole=true, guess=false;
		int playerNumber, aiNumber, tries=0;
		while(asshole) {
			System.out.print("Pick a number between 0 and 100: ");
			Scanner input  = new Scanner(System.in);
			playerNumber = input.nextInt();
			if ((playerNumber<0)||(playerNumber>100)) {
				System.out.println("Very funny. Stick to the range.\n");
			} else {
				input.close();
				asshole=false;
				System.out.println("Okay, lets boogie.");
				while(!guess) {
					aiNumber=(int)(Math.random()*100);
					tries++;
					if (playerNumber!=aiNumber) {
						System.out.println("Its not "+aiNumber+" is it? Oh well, let me try again.");
					} else {
						System.out.println("Haha! Its "+playerNumber+"! And only took me "+tries+" times to guess!");
						guess=true;
}	}	}	}	}	}