package com.general;

import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		boolean notGuessed=true;
		int numberToGuess=(int)(Math.random()*100), playerGuess, tries =0;
		while(notGuessed) {
				System.out.print("Take a guess: ");
				Scanner input  = new Scanner(System.in);
				playerGuess = input.nextInt();
				tries++;
			if (playerGuess<numberToGuess) {
				System.out.println(playerGuess+" is too small. Try higher.");
			} else if (playerGuess>numberToGuess) {
				System.out.println(playerGuess+" is too big. Try lower.");
			} else {
				System.out.println(playerGuess+" is right. You win!");
				System.out.println("It only took you "+tries+" tries to guess. Congrats :)");
				notGuessed=false;
				input.close();
}	}	}	}
