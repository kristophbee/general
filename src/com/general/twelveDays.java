package com.general;
public class twelveDays {
	public static void delayText(int delay){
		try {
			Thread.sleep(delay*100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		for(int day=1; day<13;day++) {
			System.out.print("On the ");
			switch (day) {
				case 12:
					System.out.print("twelveth ");
					break;
				case 11:
					System.out.print("eleventh ");
					break;
				case 10:
					System.out.print("tenth ");
					break;
				case 9:
					System.out.print("ninth ");
					break;
				case 8:
					System.out.print("eighth ");
					break;
				case 7:
					System.out.print("seventh ");
					break;
				case 6:
					System.out.print("sixthth ");
					break;
				case 5:
					System.out.print("fifth ");
					break;
				case 4:
					System.out.print("fourth ");
					break;
				case 3:
					System.out.print("third ");
					break;
				case 2:
					System.out.print("second ");
					break;
				case 1:
					System.out.print("first ");
					break;
				default:
					System.out.print("b0rk! ");
					break;
			}
			System.out.println("day of Christmas Payday gave to me,");
			twelveDays.delayText(5);

				if (day==12) {
					System.out.println("12 bags of loot,");
					twelveDays.delayText(20);
				}
				if (day>10) {
					System.out.println("11 doors to lockpick,");
					twelveDays.delayText(20);
				}
				if (day>9) {
					System.out.println("10 seconds response time,");
					twelveDays.delayText(20);
				}
				if (day>8) {
					System.out.println("9 hostages fleeing,");
					twelveDays.delayText(20);
				}
				if (day>7) {
					System.out.println("8 SWATs rapelling,");
					twelveDays.delayText(20);
				}
				if (day>6) {
					System.out.println("7 tasers buzzing,");
					twelveDays.delayText(20);
				}
				if (day>5) {
					System.out.println("6 dozers charging,");
					twelveDays.delayText(20);
				}
				if (day>4) {
					System.out.println("5-bullets-left!");
					twelveDays.delayText(35);
				}
				if (day>3) {
					System.out.println("4 Panicked robbers,");
					twelveDays.delayText(20);
				}
				if (day>2) {
					System.out.println("3 tires shot,");
					twelveDays.delayText(20);
				}
				if (day>1) {
					System.out.println("2 years in prison,");
					twelveDays.delayText(20);
					System.out.print("And a ");
				} else {
					System.out.print("A ");
				}
				System.out.print("broken piece a dung drill\n\n");
				twelveDays.delayText(35);
				}
		}
}