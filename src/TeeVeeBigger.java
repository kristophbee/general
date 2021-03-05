public class TeeVeeBigger extends TeeVee {

	protected TeeVeeBigger(String maker, String model){
		super(maker,model);
		channel = 50;
		volume = 25;
	}
	@Override
	public void channelUp(){
		if (this.channel<99){
			channel++;
		} else {
			channel=0;
		}
	}
	@Override
	public void channelDown(){
		if (this.channel>0){
			channel--;
		} else {
			channel=99;
		}
	}
	@Override
	public void volumeUp(){
		if (this.volume<50){
			volume++;
		}
	}
	public static void main(String[] args) {
		TeeVeeBigger bigTV = new TeeVeeBigger("Samsung", "CRT1997");
		System.out.println(bigTV.statusTV());
		bigTV.turnOn();
		System.out.println(bigTV.statusTV());
		for(int loopy=0; loopy<50;loopy++) {
			System.out.print(bigTV.whichChannel()+" ");
			bigTV.channelUp();
		}
		System.out.println("\n"+bigTV.statusTV());
	}
}
