import java.util.Scanner;

public class GuessYourNumberImproved {

	public static void main(String[] args) {
		boolean asshole=true, guess=false;
		int playerNumber, aiNumber, tries=0, lowerThan=100, higherThan=0;
		while(asshole) {
			System.out.print("Pick a number between "+higherThan+" and "+lowerThan+": ");
			Scanner input  = new Scanner(System.in);
			playerNumber = input.nextInt();
			if ((playerNumber<higherThan)||(playerNumber>lowerThan)) {
				System.out.println("Very funny. Stick to the range.\n");
			} else {
				input.close();
				asshole=false;
				System.out.println("Okay, lets boogie.");
				while(!guess) {
					aiNumber=(int)(Math.random()*(lowerThan-higherThan)+higherThan);
					tries++;
					if (aiNumber==playerNumber) {
						System.out.println("Haha! Its "+playerNumber+"! And only took me "+tries+" times to guess!");
						guess=true;
					}else if (playerNumber<aiNumber) {
						System.out.println("So "+aiNumber+" is higher? I`ll make note of that.");
						lowerThan=aiNumber;
					}else {// (playerNumber>aiNumber)
						System.out.println("So "+aiNumber+" is lower? I`ll write this down.");
						higherThan=aiNumber;
}	}	}	}	}	}//jellyfish swimming towards the shore!!!