package com.general;

public class janusz {

	public static void main(String[] args) {
		TeeVee rubin = new TeeVee("Radmor", "Rubin");
		System.out.println(rubin.statusTV());
		rubin.turnOn();
		System.out.println(rubin.statusTV());
		System.out.print("Skaczemy po kanałach: ");
		int looper=0;
		while(looper<5) {
			rubin.channelUp();
			looper++;
			System.out.print(rubin.whichChannel()+" ");
		}
		System.out.println("\n"+rubin.statusTV());
		rubin.channelDown();
		System.out.println(rubin.statusTV());
		System.out.print("Skręcamy głośność: ");
		for(looper=0;looper<3;looper++) {
			rubin.volumeDown();
			System.out.print(rubin.howLoud()+" ");
		}
		rubin.channelUp();
		System.out.print("\nRozkręcamy głośność: ");
		looper=0;
		do {
			rubin.volumeUp();
			looper++;
			System.out.print(rubin.howLoud()+" ");
		}while(looper<6);
		System.out.println("\n"+rubin.statusTV());
		rubin.mute();
		System.out.println("Did you mute the TV? "+(rubin.isMuted()?"Yes":"No!")+" Volume is "+rubin.howLoud());
		rubin.mute();
		System.out.println("Did you mute the TV? "+(rubin.isMuted()?"Yes":"No!")+" Volume is "+rubin.howLoud());
		rubin.turnOff();
		System.out.println(rubin.statusTV());
		System.out.println("Is the TV off? "+(rubin.isPowerOn()?"No, its on!":"Yup, its off"));
		System.out.println("Is the channel set to 4? "+(rubin.whichChannel()==4?"Its 4!":"Nope, its not 4"));
		System.out.println("Is the volume set to 3? "+(rubin.howLoud()==3?"Its 3!":"Its not 3"));
	}
}
