package com.general;

public class GuyController {

	public static void main(String[] args) {
		TeeVee bnwTV = new TeeVee("Andre Electronics", "ONE");
		System.out.println(bnwTV.toString());
		bnwTV.turnOn();
		System.out.println(bnwTV.toString());
		System.out.print("Channel jumping: ");
		int looper = 0;
		while (looper<5) {
			bnwTV.channelUp();
			looper++;
			System.out.print(bnwTV.channel+" ");
		}
		System.out.println("\n"+bnwTV.toString());
		bnwTV.channelDown();
		System.out.println(bnwTV.toString());
		System.out.print("Turning volume down: ");
		for (looper = 0; looper<3; looper++) {
			bnwTV.volumeDown();
			System.out.print(bnwTV.volume+" ");
		}
		bnwTV.channelUp();
		System.out.println("\n"+bnwTV.toString());
		bnwTV.turnOff();
		System.out.println(bnwTV.toString());
		System.out.println("Is the TV off? "+(bnwTV.isPowerOn()?"No, its on!":"Yup, its off"));
		System.out.println("Is the channel set to 4? "+(bnwTV.whichChannel()==4?"Its definetly 4":"No, its not 4"));
		System.out.println("Is the volume set to 3? "+(bnwTV.howLoud()==3?"Its definetly 3":"No, its not 3"));
	}

}
