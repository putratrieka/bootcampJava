package com.trieka.library;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.trieka.library.dao.AuthorDao;
import com.trieka.library.dao.LibraryItemDao;
import com.trieka.library.dao.RackDao;
import com.trieka.library.dao.RackItemDao;
import com.trieka.library.entity.Author;
import com.trieka.library.entity.LibraryItem;
import com.trieka.library.entity.Rack;
import com.trieka.library.entity.RackItem;

@SpringBootApplication
public class LibraryApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
	
	@Autowired
	private AuthorDao authorDao;
	
	@Autowired
	private LibraryItemDao libraryItemDao;
	
	@Autowired
	private RackItemDao rackItemDao;
	
	@Autowired
	private RackDao rackDao;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		//authorDao.findAll().forEach(System.out::println);
		//======================== Find Library Item by Name ==========================
//		System.out.println("======================== Find Library Item by Name =========================");
//		libraryItemDao.findLibraryItemByName("Jack Fulan").forEach(System.out::println);
//		//_____________________________________________________________________________
//		
//		//======================== Find Library Item by ISBN ==========================
//		System.out.println("======================== Find Library Item by Name =========================");
//		List<Object[]> isbn = libraryItemDao.findLibraryItemByIsbn("1245398461579");
//		
//		for (Object[] obj : isbn) {
//			System.out.println("Title : " + obj[0]);
//			System.out.println("Type Book : " + obj[1]);
//		}
//		
//		//======================== Find Library Item by ISBN ==========================
//		System.out.println("======================== Find Library Item by Name =========================");
//		List<Object[]> authorId = libraryItemDao.findLibraryItemByAuthorId(2L);
//		
//		for (Object[] obj : authorId ){
//			System.out.println("Title : " + obj[0]);
//			System.out.println("Type Book : " + obj[1]);
//		}
		
		//======================== Find Library Item by ISBN ==========================
//		System.out.println("======================== Find Library Item by Name =========================");
//		
//		Long id = 2L;
//		Integer rackQntt= rackItemDao.findQuantityByRackId(id);
//		
//		System.out.print("Jumlah item per rack untuk id ="+id + " : ");
//		System.out.println(rackQntt);
//		System.out.println("=============================================================================");

//	}
	
	}


}
