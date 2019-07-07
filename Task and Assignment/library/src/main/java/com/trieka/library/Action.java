package com.trieka.library;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trieka.library.dao.AuthorDao;
import com.trieka.library.dao.LibraryItemDao;
import com.trieka.library.dao.RackDao;
import com.trieka.library.dao.RackItemDao;
import com.trieka.library.entity.Author;
import com.trieka.library.entity.LibraryItem;
import com.trieka.library.entity.Rack;
import com.trieka.library.entity.RackItem;


@Configuration
public class Action {
	
	@Autowired
	private AuthorDao authorDao;
	
	@Autowired
	private LibraryItemDao libraryItemDao;
	
	@Autowired
	private RackItemDao rackItemDao;
	
	@Autowired
	private RackDao rackDao;
	
	
	@Bean
	@Transactional
	public void addStock() {
			
		Author author = new Author();
		author.setId(1L);
		author.setName("Jack Fulan");
		Rack rack = new Rack();
		LibraryItem item = new LibraryItem();
		
		String code = "North-04";
		String title = "Becoming";
		String type = "Book";
		String isbn = "1245398461579";
		
		rack.setCode(code);
		item.setTitle(title);
		item.setType(type);
		item.setAuthor(author);
		item.setIsbn(isbn);
		
		System.out.println(rack.getCode());
		System.out.println(item.getTitle());
		
		Integer quantity = 2;
//		=========================================================================================
		RackItem rackItem = new RackItem();
		RackItem rackItem2 = new RackItem();
		
		LibraryItem libItem = new LibraryItem();
		
		Long rackId = rackDao.findIdByCode(code).stream().findFirst().orElse(null);
		Long libraryItemId = libraryItemDao.findIdByTitle(title).stream().findFirst().orElse(null);
		
//			=================== Find Library Item Id and Rack Id
		
		rackItem = rackItemDao.findByLibItemRackId(rackId,libraryItemId).stream().findFirst().orElse(null); 
		System.out.println(rackItem);
		if(rackItem != null) {
			// add quantity
			quantity += rackItemDao.findQuantityById(rackId, libraryItemId);
			rackItem.setQuantity(quantity);
			rackItemDao.save(rackItem);
		}else {
			
			if (rackId != null) {
				System.out.println("12345");
				libraryItemDao.save(item);
			}
			if (libraryItemId != null) {
				System.out.println("123");
				rackDao.save(rack);				
			}
			rackItem2.setLibraryItem(libraryItemDao.findByTitle(title).stream().findFirst().get());
			rackItem2.setRack(rackDao.findByCode(code).stream().findFirst().get());
			rackItemDao.save(rackItem2);
			rackItem2.setQuantity(quantity);
			
			System.out.println("Table Rack Telah ditambahkan");
		}

	}
	
}
	