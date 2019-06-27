package com.eksad.training;

import java.util.HashMap;
import java.util.Map;

import com.eksad.training.bean.Pensil;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Pensil> pensilMap = new HashMap<String, Pensil>();

		Pensil pensil1 = new Pensil("Pink");
		pensilMap.put("Pensil Pink", pensil1);

		Pensil pensil2 = new Pensil("Biru");
		pensilMap.put("Pensil Biru", pensil2);

		Pensil getPensil = pensilMap.get("Pensil Pink");
		System.out.println(getPensil.getWarna());

		getPensil = pensilMap.get("Pensil Biru");
		System.out.println(getPensil.getWarna());
		
		
	}

}
