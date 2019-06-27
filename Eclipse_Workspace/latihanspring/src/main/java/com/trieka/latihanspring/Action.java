package com.trieka.latihanspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // supaya class dapat discan oleh spring
public class Action {
	@Autowired // injeksi class yg diambil dari memory tanpa perlu diinisiasi 
	MyService myService;
	
	@Bean
	public String hello() {
		
		System.out.println(myService.getJson());
		return myService.getJson();
	}
}
