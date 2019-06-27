package com.eksad.training;

import com.eksad.training.bean.Kertas;
import com.eksad.training.bean.Pensil;

public class Writing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pensil pensil1 = new Pensil("hitam");		
		Pensil pensil2 = new Pensil("hitam");
		
		pensil1.setWarna("pink");
		pensil2.setWarna("biru");
		System.out.println("Pensil 1: "+pensil1.getWarna());
		System.out.println("Pensil 2: "+pensil2.getWarna());
		
		Kertas kertas = new Kertas();
		kertas.tulis(pensil1, "Eksad");
		kertas.tulis(pensil2, "Oye oye");
		
		System.out.println(kertas.getIsi());
		

	}

}
