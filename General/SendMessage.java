package General;
import java.util.Scanner;

public class SendMessage {

	public static void main(String[] args) {
		String userLogin="Kris", recepient="defaultrec", message="defaultmes", finalmessage="defaultfinmes";
					//TODO option to leave a message
					Scanner input = new Scanner(System.in);
					System.out.print("Who do you want to message? ");
					//TODO read recepient
					recepient = input.nextLine();
					System.out.println("What do you want to sat to "+recepient+"? ");
					//TODO read message
					message = input.nextLine();
					input.close();
					finalmessage=(userLogin+":"+recepient+":"+message);
					System.out.println("\n"+finalmessage);
					//TODO write to file
	}

}
