public class TeeVee {
	private String brand="Sony";
	private String model="WTF99";
	private boolean powerOn;
	byte channel;
	byte volume;
	private byte volumePrev;
	private boolean isMute;

	//mietody
	public void turnOn(){
		this.powerOn = true;
	}
	public void turnOff(){
		this.powerOn = false;
	}
	public void channelUp(){
		if (this.channel<13){
			channel++;
		} else {
			channel=0;
		}
	}
	public void channelDown(){
		if (this.channel>0){
			channel--;
		} else {
			channel=13;
		}
	}
	public void volumeUp(){
		if (this.volume<5){
			volume++;
		}
	}
	public void volumeDown(){
		if (this.volume>0){
			volume--;
		}
	}
	public void mute(){
		if(isMute){
			this.volume = volumePrev;
			isMute=false;
		} else {
			this.volumePrev = volume;
			volume = 0;
			isMute=true;
		}
	}
	//kąstruktor do dziedziczenia
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
	public String statusTV() {
		return this.brand+" "+this.model+" "+this.powerOn+" "+this.channel+" "+this.volume;
	}
	public boolean isMuted() {
		return this.isMute;
	}
}