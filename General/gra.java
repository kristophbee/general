package General;
import java.util.Scanner;
public class gra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Chesz zagra� w gr�? Wpisz swoje imi�: ");
		String imie = input.nextLine();
		input.close();
		System.out.println(imie + "! przegra�e� gr�...");
	}

}
