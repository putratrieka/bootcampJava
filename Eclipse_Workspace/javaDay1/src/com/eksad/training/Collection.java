package com.eksad.training;

import java.util.ArrayList;
/*import java.util.HashSet;
import java.util.LinkedHashSet;*/
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();

		// add element to list
		stringList.add("AYAM");
		stringList.add("KUCING");
		stringList.add("BEBEK");
		stringList.add("ANJING");
		stringList.add("KECOA");
		stringList.add("MONYET");

		stringList.add(3, "KUCING");
		stringList.add(4, "CICAK");

		stringList.remove(0);
		stringList.remove("BEBEK");

		System.out.println("Index of Kucing: " + stringList.indexOf("KUCING"));

		for (String str : stringList) {
			System.out.println(str);
		}

		List<Integer> integerList = new ArrayList<Integer>();

		// add element to list
		integerList.add(6);
		integerList.add(7);
		integerList.add(0);

		integerList.remove((Integer) 0);
		for (Integer integer : integerList) {
			System.out.println(integer);
		}

		TreeSet<String> stringSet = new TreeSet<String>();
		// 1. HashSet: Mengurutkan dari karakter terbanya dan abjad,
		// 2. LinkedHashSet : Mengurutkan sesuai urutan data yang dimasukkan
		// 3. TreeSet : Mengurutkan sesuai Abjad
		
		stringSet.add("Honda");
		stringSet.add("Yamaha");
		stringSet.add("Suzuki");
		stringSet.add("BMW");
		stringSet.add("Mercedes Benz");

		stringSet.remove("Yamaha");
		stringSet.add("Toyota");
		
		Set<String> descSet = stringSet.descendingSet();
		
		for (String merk : stringSet) {
			System.out.println(merk);
		}
		
		for (String merk : descSet) {
			System.out.println(merk);
		}
		
		Queue<String> queue = new LinkedList<String>(); 
		//Satu Class bisa implement banyak interface, kalau extend hanya bisa 1 parent
		queue.add("John");
		queue.add("Mark");
		queue.add("Aceng");
		queue.add("Sodaranya Aceng");
		queue.add("Lukas");
		 
		String next = new String (queue.poll());
		System.out.println(next);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("Tukang Ojek Aceng");
		System.out.println("=======");
		
		
		
	/*	for (String orang : queue) {
			System.out.println(orang);

		}*/
		
		
		
		
	}
}