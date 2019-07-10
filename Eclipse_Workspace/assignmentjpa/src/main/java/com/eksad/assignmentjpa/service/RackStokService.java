package com.eksad.assignmentjpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.eksad.assignmentjpa.dao.LibraryItemDao;
import com.eksad.assignmentjpa.dao.RackItemDao;
import com.eksad.assignmentjpa.entity.Author;
import com.eksad.assignmentjpa.entity.LibraryItem;
import com.eksad.assignmentjpa.entity.Rack;
import com.eksad.assignmentjpa.entity.RackItem;

	

public class RackStokService {
	
//	@Autowired
//	private AuthorDao authorDao;
	
	@Autowired
	private LibraryItemDao libraryItemDao;
	
	@Autowired
	private RackItemDao rackItemDao;
	

	
	public void addStock(Rack rack, LibraryItem item, Integer quantity) {
	
		RackItem rackItem = rackItemDao.findByRackAndLibraryItem(rack, item);

		if(rackItem == null) {
			rackItem = new RackItem();
			rackItem.setLibraryItem(item);
			rackItem.setRack(rack);
			rackItemDao.save(rackItem);
			rackItem.setQuantity(0);
		}
		rackItem.setQuantity(rackItem.getQuantity() + quantity);
		rackItemDao.save(rackItem);
	}
	
	public void reduceStock(Rack rack, LibraryItem item, Integer quantity) {

		RackItem rackItem = rackItemDao.findByRackAndLibraryItem(rack, item);
		if(rackItem == null) {
			return;
		}
		rackItem.setQuantity(rackItem.getQuantity() - quantity);
		if (rackItem.getQuantity() <= 0) {
			rackItemDao.delete(rackItem);
			 
		}else {
			rackItemDao.save(rackItem);
		}
	}
	@Transactional
	public void reduceStock(Rack from, Rack to, LibraryItem item, Integer quantity) {
		reduceStock(from, item, quantity);
		
		addStock(to, item, quantity);
		
	}
	
	
	

}
