package General;
import java.util.Scanner;
public class gra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Chesz zagraæ w grê? Wpisz swoje imiê: ");
		String imie = input.nextLine();
		input.close();
		System.out.println(imie + "! przegra³eœ grê...");
	}

}
