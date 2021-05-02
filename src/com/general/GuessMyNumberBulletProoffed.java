package com.general;

import java.util.Scanner;

public class GuessMyNumberBulletProoffed {

	public static void main(String[] args) {
		boolean notGuessed = true;
		int numberToGuess = (int) (Math.random() * 100), playerGuess, tries = 0, validate=0;
		Scanner input = new Scanner(System.in);
		while (notGuessed) {
			System.out.print("Take a guess(0-100): ");
			tries++;
			try {
				String consInput;
				consInput = input.nextLine();
				validate = Integer.parseInt(consInput);
			} catch (Exception e) {
				System.out.println("Not cool. Integers only. Also, this counts as a try.");
				continue;
			}
			playerGuess = validate;
			if (playerGuess < numberToGuess) {
				System.out.println(playerGuess + " is too small. Try higher.");
			} else if (playerGuess > numberToGuess) {
				System.out.println(playerGuess + " is too big. Try lower.");
			} else {
				System.out.println(playerGuess + " is right. You win!");
				System.out.println("It only took you " + tries + " tries to guess. Congrats :)");
				notGuessed = false;
				input.close();
}	}	}	}
