package General;

public class LoopDeLoop {

	public static void main(String[] args) {
		byte channel = 0;
		final byte CHNNLS = 5;
		System.out.print("Channels running:");
		while(channel<CHNNLS) {
			channel++;
			System.out.print(" "+channel);
		}
	}

}
