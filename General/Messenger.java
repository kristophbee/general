package General;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Messenger {
	
	public static String send(String user, Path messages) throws IOException {
		String userLogin=user, recepient="defrec", message="defmes";
		//option to leave a message
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.print("Who do you want to message? ");
		//read recepient
		recepient = input1.nextLine();
		System.out.println("What do you want to say to "+recepient+"? ");
		//read message
		message = input1.nextLine();
		//input1.close();
		  try (BufferedWriter out = Files.newBufferedWriter(messages, StandardOpenOption.APPEND)) {
		          out.append("\n"+userLogin+":"+recepient+":"+message);
		  } catch (IOException e) {
		          System.err.println("There was an error reading lines.");
		          throw e;
		  }
		return(userLogin+":"+recepient+":"+message);
	}
	
	public static void readDB(String user, Path messages) throws IOException {
		System.out.print("Loading database...");
//		Path messages = Paths.get("messages.txt");
		List<String> messagesDB;
		try {
			messagesDB = Files.readAllLines(messages);
		} catch (IOException e) {
			System.err.println("Uh oh.\n");
			throw e;
		}
		System.out.println("Done.\n");
		List<String> renders = new ArrayList<>();
		List<String> recepients = new ArrayList<>();
		List<String> message = new ArrayList<>();
		for (String line : messagesDB) {
			String[] temp1 = line.split(":");
			renders.add(temp1[0]);
			recepients.add(temp1[1]);
			message.add(temp1[2]);
			if (temp1[1].equals(user)) {
				System.out.println("From:\t"+temp1[0]+"\nTo:\t"+temp1[1]+"\n\nMessage:\n"+temp1[2]+"\n");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Whats your login? ");
		String userLogin = input.nextLine();
		System.out.println("Hello " + userLogin + "!");
		Path messages = Paths.get("messages.txt");
		Messenger.readDB(userLogin,messages);
		int choice=0;
		while((choice!=1)||(choice!=2)) {
		System.out.print("\nPress 1 to leave a message.\nPress 2 to read your messages again.\nPress any other NUMBER to quit. ");
		try {
			String consInput;
			consInput = input.nextLine();
			choice = Integer.parseInt(consInput);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Oops!");
			break;
		}
			if (choice==1) {
				String messageToUpload=Messenger.send(userLogin,messages);
				System.out.println(messageToUpload);
				System.out.println("\nMessage sent :)\n");
			} else if (choice==2) {
				Messenger.readDB(userLogin,messages);
			} else {
				break;
			}
		}
		System.out.println("\nGoodbye "+userLogin);
	}
}