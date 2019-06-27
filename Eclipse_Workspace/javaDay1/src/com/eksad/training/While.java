package com.eksad.training;

public class While {

	public static void main(String[] args) {

		String word = "Eksad";
		while (word.length() < 10) {
			word += "=";
			
		}
		System.out.println(word);
		
		String word2 = "Eksad";
		for(;word2.length() < 10;) {
			word2 += "+";
		}
		System.out.println(word2);
		
		String word3 = "Eksad*****";
		do {
			word3 += "*";
		} while (word3.length() < 10);
		
		System.out.println(word3);
	
	}

}
