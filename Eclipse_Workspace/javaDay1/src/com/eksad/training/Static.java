package com.eksad.training;

import com.eksad.training.bean.Kalkulator;
import com.eksad.training.bean.Kertas;

public class Static {
	public static void main(String[] args) {
		Kertas kertas1 = new Kertas();
		kertas1.setUkuran("A4");
		Kertas.setNama("kertas 1");
		
		Kertas kertas2 = new Kertas();
		kertas2.setUkuran("A5");
		//Kertas.setNama("kertas 2");
		
		System.out.println(kertas1.getUkuran());
		System.out.println(Kertas.getNama());
		System.out.println(kertas2.getUkuran());
		System.out.println(Kertas.getNama());
		
		
		Kalkulator kalkulator = new Kalkulator();
		kalkulator.setKiri(6);
		kalkulator.setKanan(9);
		System.out.println(kalkulator.proses());
		System.out.println(Kalkulator.tambah(4, 3));
	}
}
