package General;

public class TeeVee {
	protected String brand="Sony";
	protected String model="WTF1985";
	protected boolean powerOn=false;
	protected byte channel;
	protected byte volume;
		
	public void turnOn() {
		powerOn=true;
	}
	
	public void turnOff() {
		powerOn=false;
	}
	
	public void channelUp() {
		if (channel==13){
			channel=0;
		} else {
		channel++;
		}
	}

	public void channelDown() {
		if (channel==0){
			channel=13;
		} else {
		channel--;
		}
	}

	public void volumeUp() {
		if (volume<10){
			volume++;
		}
	}

	public void volumeDown() {
		if (volume>0){
			volume--;
		}
	}
	
	public TeeVee (String brand, String model) {
		this.brand=brand;
		this.model=model;
		powerOn=false;
		channel=0;
		volume=1;
	}
	public boolean isPowerOn() {
		return this.powerOn;
	}
	public byte whichChannel() {
		return this.channel;
	}
	public byte howLoud() {
		return this.volume;
	}
	public String toString() {
		return this.brand + " "+this.model+" "+this.powerOn+" "+this.channel+" "+this.volume;
	}
	public static void main(String[] args) {
		System.out.println("Im a TV!!!");
	}

}
