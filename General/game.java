package General;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("You want to play a game? Enter your name: ");
		String imie = input.nextLine();
		input.close();
		System.out.println(imie + "! You lost the game...");
	}

}
