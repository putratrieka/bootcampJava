package com.eksad.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.eksad.training.bean.Laptop;

public class StreamTest {
	public static void main(String[] args) {
		List<Laptop> laptopList = new ArrayList<Laptop>();
		
		Laptop dell = new Laptop("Dell");
		dell.setBerat(100);
		laptopList.add(dell);
		
		Laptop lenovo = new Laptop("Lenovo");
		lenovo.setBerat(120);
		laptopList.add(lenovo);
		
		Laptop hp = new Laptop("HP");
		hp.setBerat(98);
		laptopList.add(hp);
		
		Laptop asus = new Laptop("Asus");
		laptopList.add(asus);

		List<String> merkLaptopList = new ArrayList<String>();
		for (Laptop laptop: laptopList) {
			if (laptop.getMerk().contains("e")) {
				merkLaptopList.add(laptop.getMerk());
			}
		}
		//System.out.println(merkLaptopList);		
		//menggunakan Stream
//		laptopList.stream()
//			.map(new Function<Laptop, String>() {
//				
//			})
		List<String>merkLaptopByName = laptopList.stream()
							.map(laptop -> laptop.getMerk())
							.filter(merk -> merk.contains("e")||merk.contains("u"))
							.filter(merk -> merk.contains("l"))
							.collect(Collectors.toList());//collect
		System.out.println(merkLaptopByName);
		
		Integer totalBerat = 0;
		Integer jumlah = 0;
		for (Laptop laptop : laptopList) {
			if (laptop.getBerat() != null) {
				totalBerat += laptop.getBerat();
				jumlah ++;
			}
			
		}
		Double rataRata1 = totalBerat.doubleValue()/jumlah.doubleValue();
		System.out.println(rataRata1);
		// metode stream

		Double rataRata2 = laptopList.stream()
				.map(laptop ->laptop.getBerat())// cara 1 unt simplifikasi
//				.map(Laptop::getBerat)// cara 2 unt simplifikasi (invoke)
				.filter(berat -> berat != null)
				.collect(Collectors.averagingDouble(berat -> berat.doubleValue()));
//				.mapToDouble(berat -> berat)
//				.average().orElse(0);
		
		System.out.println(rataRata2);
	}
}
