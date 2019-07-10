package com.eksad.assignmentjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eksad.assignmentjpa.entity.LibraryItem;
import com.eksad.assignmentjpa.entity.Rack;
import com.eksad.assignmentjpa.service.RackStokService;

@SpringBootApplication
public class AssignmentjpaApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(AssignmentjpaApplication.class, args);
	}
	// memanggil @bean
	@Bean
	public RackStokService rackStokService() {
		return new RackStokService();
	}
	@Autowired
	RackStokService rackStokService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		
		Integer quantity = 2;
		Rack rack = new Rack();
		LibraryItem item = new LibraryItem();
		
		rackStokService.addStock(rack, item, quantity);
	}
	
	
}
