package com.general;

public class TwelveDaysOfPayday {
	protected static void delayText(int mseconds) {
		try {
			Thread.sleep(mseconds * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String[] lyrics = { "broken piece of shit drill\n", "2 years in prison,", "3 tires shot,",
				"4 panicked robbers,", "5-BULLETS-LEFT!!!", "6 dozers charging,", "7 tasers buzzing,",
				"8 SWATs rapelling,", "9 hostages fleeing,", "10 seconds response time,", "11 doors to lockpick,",
				"12 bags of coke," };
		String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth",
				"eleventh", "twelveth" };
		int verse = 0;
		for (int day = 0; day < 12; day++) {
			verse = day;
			System.out.println("On the " + days[day] + " day of Christmas Payday gave to me,");
			TwelveDaysOfPayday.delayText(40);
			while (verse >= 0) {
				if (day == 0) {
					System.out.print("A ");
				} else if (verse == 0) {
					System.out.print("And a ");
				}
				System.out.println(lyrics[verse]);
				if (verse == 0 || (verse == 4)) {
					TwelveDaysOfPayday.delayText(35);
				} else {
					TwelveDaysOfPayday.delayText(20);
				}
				verse--;
}	}	}	}