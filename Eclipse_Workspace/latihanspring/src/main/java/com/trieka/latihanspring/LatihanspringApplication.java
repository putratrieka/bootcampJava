package com.trieka.latihanspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // membaca class yang akan dirunning dan scanning injeksi dalam package dan sub package
public class LatihanspringApplication {

	public static void main(String[] args) {
		//menjalankan spring framework
		SpringApplication.run(LatihanspringApplication.class, args);
	}
//	@Bean // 	
//	public String hello() {
//		String hello = "Hello World";
//		System.out.println(hello);
//		return hello;
//	}
}
