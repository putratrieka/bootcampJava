package com.eksad.training;

import com.eksad.training.bean.Ajudan;
import com.eksad.training.bean.Bos;
import com.eksad.training.bean.Kendaraan;

public class Lambda {
	public static void main(String[] args) {
		//cara 1 DENGAN mendefenisikan kedalam variable baru
		Kendaraan kendaraan = new Kendaraan() {
			// Annonimous Class
			@Override
			public String maju() {
				// TODO Auto-generated method stub
				return "Ayo bg Gojek";
			}
		};
		Bos bos = new Bos();
		bos.naikKendaraan(kendaraan);
		// cara kedua, TANPA mendefenisikan kedalam variable baru
		Bos bos2 = new Bos();
		bos2.naikKendaraan(new Kendaraan() {
			
			@Override
			public String maju() {
				// TODO Auto-generated method stub
				return "Gojek lagi bg....";
			}
		});
		System.out.println("========================");
		//cara 3 functional programming
		bos.naikKendaraan(()->"Ajo Gojek");
		bos.naikKendaraan(()->{
			String bgGojek = "Faisal";
			return "Ayo bang " + bgGojek;
		});
	}
}
