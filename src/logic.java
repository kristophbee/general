import java.time.*;

public class logic {
	public static void main (String args[]){
	int a=1, b=2;
	@SuppressWarnings("unused")
	boolean test, t2=true, t3=false;
	//testy logiczne
	System.out.println("Is " + a + " bigger than " + b + "? " + (test=(a>b)));
	System.out.println("Is " + a + " not equal to " + b + "? " + (test=(a!=b)));
	System.out.println("Is " + a + " equal to " + b + "? " + (test=(a==b)));
	System.out.println("Is " + a + " less than " + b + "? " + (test=(a<b)));
	System.out.println("Is " + a + " less or equal than " + b + "? " + (test=(a<=b)));
	System.out.println("Is " + a + " greater or equal than " + b + "? " + (test=(a>=b)));
	System.out.println("Is " + a + " greater or equal than " + b + "? " + (test=(a>=b)));
	System.out.println("Is " + t2  + " AND " + t3 + " true? " + (test=(t2&&t3)));
	System.out.println("Is " + t2  + " OR " + t3 + " true? " + (test=(t2||t3)));
	System.out.println("Is " + t2  + " NOT " + t3 + " true? " + (test=(t2=(!(t3)))));
	System.out.println("Is " + a  + " equal to " + b + "? " + (a==b?"Si":"Nope"));

	//polimorfizm w JDK

	//wypluj Object na kąsoli
	System.out.println(new Object());
	//wypluj StringBuildera
	System.out.println(new StringBuilder("tiruriru"));

	//wypluj klasę która nie nadpisuje toString:
	//System.out.println(new First());
	//logic.java:25: error: cannot find symbol
	//System.out.println(new First());
	//                       ^

	//nadpisz metodę toString()
	//System.out.println(new Second());
	//logic.java:27: error: cannot find symbol
	//System.out.println(new Second());
	//                       ^
  //symbol:   class Second
  //location: class logic

	//Modyfikacja listy:
	//String[] names = {"Ned","Fred","Jessie","Alice","Rick"};
	//List <String> mylist = new ArrayList(Arrays.asList(names));
	//Display all names in upper case
	//for (String s: mylist){
	//	System.out.print(s.toUpperCase()+", ");
	//}
	//wypluwamy arraya po pyntli
	//System.out.println("After the loop: "+mylist);
	
	//dej datę
	LocalDate myDate = LocalDate.now();
	System.out.println("Todays date: "+myDate);
	System.out.println("Todays time: "+LocalTime.now());
	System.out.println("Todays date and time: "+LocalDateTime.now());
	//jestem debilem, nie działało bo używałem daty a nie daty i godziny
	//LocalDateTime today = LocalDateTime.now();
	//String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
	//System.out.println("Todays date and time formatted: "+sdate);
	//String fdate=today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
	//System.out.println("Formatted with MEDIUM FormatStyle: "+fdate);
	//japoński format z java.time.chrono
	//JapaneseDate jDate = JapaneseDate.from(myDate);
	//System.out.println("Todays time in Japanese format: "+jDate);
	
	
	
	}// kuniec maina
}//kuniec fszystkiego
