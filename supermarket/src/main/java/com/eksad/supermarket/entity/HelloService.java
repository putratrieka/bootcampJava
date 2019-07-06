package com.eksad.supermarket.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDao;

public class HelloService {
	
	@Autowired
	private BrandDao brandDao;
	
	private String greetings;
	
//	@Transactional(propagation = Propagation)
	public String sayHello(String name) {
		
//		brandDao.save(null);
//		brandDao.findAll().forEach(System.out::println);
		
		return "Hello"+ name;
		
	}
}
