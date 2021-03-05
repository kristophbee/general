package com.general;
public class TeeVeeColor extends TeeVee {
	
	protected TeeVeeColor(String maker, String model){
		super(maker,model);
		volume=25;
		channel = 50;
	}
	
	@Override
	public void channelUp() {
		if (channel==99){
			channel=0;
		} else {
		channel++;
		}
	}
	
	@Override
	public void channelDown() {
		if (channel==0){
			channel=99;
		} else {
		channel--;
		}
	}
	@Override
	public void volumeUp() {
		if (volume<50){
			volume++;
		}
	}
	public static void main(String[] args) {
		TeeVeeColor colorTelly = new TeeVeeColor("Samsung","CRT1997");
		System.out.println(colorTelly.toString());
		for(int repeat = 0; repeat!=55; repeat++) {
			colorTelly.channelUp();
			System.out.print(colorTelly.whichChannel()+" ");
		}
	}
}