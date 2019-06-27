package com.eksad.training;

import com.eksad.training.bean.Pensil;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stubz
//		Instentiate, --> pensil -> instantiance
		Pensil pensil = new Pensil("biru");
		System.out.println(pensil.getWarna());
//--------------------------------------------
		pensil.setWarna("Hitam");
		System.out.println(pensil.getWarna());

//		Immutable 		
		String word = new String("Eksad");
		System.out.println(word);
//---------------------------------------

//		Concat
		String word1 = "EKsad";
		System.out.println(word1);
		String word2 = word1.concat(" oye");
		System.out.println(word2);
//----------------------------------------
//		String builder
		StringBuilder builder = new StringBuilder("Eksad");
		for (int i = 0; i < 5; i++) {
			builder.append(" Oye");
		}
		System.out.println(word1);	
//--------------------------------------------

	}

}
