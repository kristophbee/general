package com.general;

public class numbersletters {

	public static void main(String[] args) {
		char findChar = 'e';
		String phrase = "She sells seashells by the seashore";
		//String phrase = "eeee";
		int findCharCount = 0;
	for (int pos = 0; pos < phrase.length();pos++) {
		if (phrase.charAt(pos) != findChar){
			continue;
		}
		findCharCount++;
	}
	System.out.println("The letter "+findChar+" shows "+findCharCount+" times in the phrase:");
	System.out.println(phrase);
	}
}
