package com.general;
public class funWithArgs {
	public static void main(String[] args) {
// java -Dhero0=galoty -Dhero1=czapeczka funWithArgs gacie skarpety koszulka
		System.out.print("Args: ");
		System.out.print(args[0]+" ");
		System.out.print(args[1]+" ");
		System.out.println(args[2]);
		System.out.print("Parametreły VM: ");
		String hero0=System.getProperty("hero0");
		String hero1=System.getProperty("hero1");
		System.out.print(hero0+" ");
		System.out.print(hero1);
	}
}
