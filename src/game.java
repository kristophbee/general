import java.util.Scanner;
public class game {

	public static void main(String[] args){
		System.out.print("You want to play a game? Enter your name: ");
		String imie;
		Scanner input  = new Scanner(System.in);
		imie = input.nextLine();
		input.close();
		System.out.println(imie + "! You lost the game...");
	}
}
