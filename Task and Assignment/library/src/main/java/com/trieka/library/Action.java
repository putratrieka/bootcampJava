package com.trieka.library;

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
	public void addStock() {
		
			Integer quantity = 2;
			Long libraryItemId = 2L;
			Long rackId = 1L;
			
			RackItem rackItem = new RackItem();
			
			Author author = new Author();
			
			rackItem = rackItemDao.findByLibItemRackId(1L,2L).stream().findFirst().orElse(null); 
			
			if(rackItem != null) {
				quantity += rackItemDao.findQuantityById(rackId, libraryItemId);
				rackItem.setQuantity(quantity);
				rackItemDao.save(rackItem);
			}

	}

}
	