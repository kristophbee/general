package General;
public class TeeVeeFlat extends TeeVeeColor {
	
	TeeVeeFlat(String maker, String model){
		super(maker, model);
	}
	
	public static void main(String[] args) {
		TeeVeeColor flatTelly = new TeeVeeFlat("LG", "FlatPanel2003");
		System.out.println(flatTelly.toString());
	}
}