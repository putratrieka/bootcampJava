package com.trieka.latihanmaven;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	HashMap<String, Object> map = new HashMap<String, Object>();
//    	HashMap<String, Object> map1 = new HashMap<String, Object>();
//    	HashMap<String, Object> map2 = new HashMap<String, Object>();
    	
    	String[] tlp = new String[] {"0899","0852","0752"};
    	String[] almt = new String[] {"hsah","bshh"};

    	map.put("nama", "nama");
    	map.put("alamat",almt);
    	map.put("telp",tlp);
    	
  //  	ArrayList<Object> array = new ArrayList<Object>();
    	ArrayList<HashMap> array = new ArrayList<HashMap>();
    	array.add(map);
    	array.add(map);
    	array.add(map);
//    	array.add("ghi");
//    	
//    	System.out.println(map.get("Latihan Maven"));
//    	Gson gson = new Gson();
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();// pretty printing
    	String json = gson.toJson(array);
    	gson.toJson(map);
    	System.out.println(json);
    	
//    	{
//    		"nama":"abc",
//    		"alamat":"cba",
//    		"telp":["089890829",
//    		        "08989",
//    		        "079589"]
//
//    	}
    }
}
