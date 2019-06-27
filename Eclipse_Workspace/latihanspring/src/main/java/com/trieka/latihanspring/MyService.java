package com.trieka.latihanspring;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class MyService {
//	@Value("${app.name}")
//	String value;
//	
	
	public String getJson() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		String[] tlp = new String[] {"0899","0852","0752"};
		String[] almt = new String[] {"hsah","bshh"};
		
		map.put("nama","nama");
		map.put("alamat",almt);
		map.put("telp",tlp);
		
	//  	ArrayList<Object> array = new ArrayList<Object>();
		ArrayList<HashMap> array = new ArrayList<HashMap>();
		array.add(map);
		array.add(map);
		array.add(map);
	//	array.add("ghi");
	//	
	//	System.out.println(map.get("Latihan Maven"));
	//	Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();// pretty printing
		String json = gson.toJson(array);
		gson.toJson(map);
		
		return json;
	}
}
