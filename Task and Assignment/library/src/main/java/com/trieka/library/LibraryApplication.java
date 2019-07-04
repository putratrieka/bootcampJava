package com.trieka.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trieka.library.dao.AuthorDao;
import com.trieka.library.dao.LibraryItemDao;
import com.trieka.library.entity.LibraryItem;

@SpringBootApplication
public class LibraryApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
	
	@Autowired
	private AuthorDao authorDao;
	
	private LibraryItemDao libraryItemDao;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		List<LibraryItem> findName = libraryItemDao.findLibraryItemByName("Jack Fulan");
		System.out.println(findName);
//		findName.forEach(System.out::println);
//		authorDao.findAll()
//			.forEach(System.out::println);
		// ========================= Find Library Item by Name =============================
//		  libraryItem = new LibraryItem();
//		  LibraryItem libraryItem = libraryItemDao.findLibraryItemByName("Jack Fulan");
//				  .stream()
//				  .findFirst()
//				  .orElse(null);
//			List<Object[]> totals = libraryItemDao.findLibraryItemByName("Jack Fulan");
					
//					for (Object[] total : totals) {
//						System.out.println("id : " + total[0]);
//						//System.out.println("total : " + total[1]);
//					}
//		  if (libraryItem != null) {
////			  System.out.println(libraryItem);
//			  libraryItemDao.findAll().forEach(System.out::println);
//		  }
		  
		

	}

}
