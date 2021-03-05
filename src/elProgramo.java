public class elProgramo {
	public static void main(String[] args) {
		//if ((args == null)||(args.length==0)){
		if (args.length==0){
			System.out.println("Nie podałeś argów :***(");
		}
		else {
			System.out.print("Argi:");
			for (String name:args){
				System.out.print(" "+name);
			}
			System.out.println();
		}
	}
}
