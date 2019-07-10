package com.trieka.library;

import java.util.List;

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
public class BeanClass {
	
	@Autowired
	private AuthorDao authorDao;
	
	@Autowired
	private LibraryItemDao libraryItemDao;
	
	@Autowired
	private RackItemDao rackItemDao;
	
	@Autowired
	private RackDao rackDao;
	

//	=============================================================================================================
//	=========================================== Add Stok =====================================================
//	=============================================================================================================
//	@Bean
	@Transactional
	public void addStock(Author author, Rack rack, LibraryItem item, Integer quantity ) {
			
		System.out.println("=====================================");
		System.out.println("=========== Add Rack Item ===========");
		System.out.println("=====================================");

//		=========================================================================================
		RackItem rackItem = new RackItem();
		RackItem rackItem2 = new RackItem();
		
		LibraryItem libItem = new LibraryItem();
		
		Long rackId = rackDao.findIdByCode(rack.getCode()).stream().findFirst().orElse(null);
		Long libraryItemId = libraryItemDao.findIdByTitle(item.getTitle()).stream().findFirst().orElse(null);
		Long authorId = authorDao.findIdByName(author.getName()).stream().findFirst().orElse(null);
//			=================== Find Library Item Id and Rack Id
		
		rackItem = rackItemDao.findByLibItemRackId(rackId,libraryItemId).stream().findFirst().orElse(null); 
		System.out.println(authorId);
		if(rackItem != null) {
			if (authorId == null) {
				System.out.println("author null");
				authorDao.save(author);
			}
			// add quantity
			quantity += rackItemDao.findQuantityById(rackId, libraryItemId);
			rackItem.setQuantity(quantity);
			rackItemDao.save(rackItem);
		}else {
			if (authorId == null) {
				System.out.println("author null");
				authorDao.save(author);
			}
			if (rackId != null) {
				libraryItemDao.save(item);
			}
			if (libraryItemId != null) {
				rackDao.save(rack);				
			}

			rackItem2.setLibraryItem(libraryItemDao.findByTitle(item.getTitle()).stream().findFirst().get());
			rackItem2.setRack(rackDao.findByCode(rack.getCode()).stream().findFirst().get());
			rackItemDao.save(rackItem2);
			rackItem2.setQuantity(quantity);
			
			System.out.println("Table Rack Telah ditambahkan");
			System.out.println(rackItem2);
		}
		

	}
//	=============================================================================================================
//	=========================================== Reduce Stok =====================================================
//	=============================================================================================================

	
//	@Bean
//	@Transactional
	public void reduceStock() {
			
		System.out.println("======================================");
		System.out.println("========== Reduce Rack Item ==========");
		System.out.println("======================================");
		Rack rack = new Rack();	
		RackItem rackItem = new RackItem();
		RackItem rackItem2 = new RackItem();
		
		LibraryItem libItem = new LibraryItem();
		
		Long rID = 17L;
		Long lID = 8L;
		Integer  redQtt = 3;
		Integer quantity;


		rackItem = rackItemDao.findByLibItemRackId(rID,lID).stream().findFirst().orElse(null); 
		System.out.println(rackItem.getQuantity());
		
		if(rackItem != null) {
		// add quantity
			quantity = rackItemDao.findQuantityById(rID, lID)-redQtt;
			System.out.println(quantity);
			
			if (quantity == 0) {
				rackItemDao.delete(rackItem);
			}else if (quantity < 0) {
				rackItemDao.delete(rackItem);
				while (quantity < 0) {
					System.out.println("===================================");
					System.out.println();
					
					RackItem rackReduce = new RackItem();
					rackReduce = rackItemDao.findByLibItemId(lID).stream().findAny().orElse(null);
					System.out.println(rackReduce.getQuantity());
					System.out.println(rackReduce.getLibraryItem());
					System.out.println(rackReduce.getRack().getId());
					Integer reduceItem = (rackReduce.getQuantity())-(quantity*(-1));
				 	System.out.println(reduceItem);
					System.out.println(quantity);
					if (reduceItem > 0) {
						rackReduce.setQuantity(reduceItem);		
						rackItemDao.save(rackReduce);
						quantity = reduceItem;
					}else if (reduceItem == 0) {
						System.out.println("delllllll");
						rackItemDao.delete(rackReduce);
						break;
					}else {
						quantity = reduceItem;
					}
					
				}			
			}else {
				rackItem.setQuantity(quantity);
				rackItemDao.save(rackItem);
			}
		}
	}
	
//	=============================================================================================================
//	============================================= Transfer Rack =================================================
//	=============================================================================================================
	
//	@Bean
//	@Transactional
	public void transStock() {
		
		System.out.println("=====================================");
		System.out.println("====== Mutasi Rack Item ======");
		System.out.println("=====================================");

		
		Long rackIdOrigin = 1L;
		Long rackIdDest = 2L;
		Long itemLibId = 8L;
		Integer transQtt = 2;
		Integer quantity;
		
		
//		=============================== Reduce Stock from RanckIdOrigin =========================
		
		RackItem rackItem = new RackItem();
		
		rackItem = rackItemDao.findByLibItemRackId(rackIdOrigin,itemLibId).stream().findFirst().orElse(null); 
		
		if(rackItem != null) {
		
			// add quantity
			System.out.println("=====================1");
			quantity = rackItemDao.findQuantityById(rackIdOrigin, itemLibId)-transQtt;
			System.out.println(quantity);
			
			if (quantity == 0) {
				rackItemDao.delete(rackItem);
				System.out.println("=====================2");
				
			}else if (quantity < 0) {
				rackItemDao.delete(rackItem);
				System.out.println("=====================3");
				while (quantity < 0) {
					System.out.println("===================================4");
					System.out.println();
					
					RackItem rackReduce = new RackItem();
					rackReduce = rackItemDao.findByLibItemId(itemLibId).stream().findAny().orElse(null);
					System.out.println(rackReduce.getQuantity());
					System.out.println(rackReduce.getLibraryItem());
					System.out.println(rackReduce.getRack().getId());
					Integer reduceItem = (rackReduce.getQuantity())-(quantity*(-1));
					System.out.println(reduceItem);
					System.out.println(quantity);
					if (reduceItem > 0) {
						rackReduce.setQuantity(reduceItem);		
						rackItemDao.save(rackReduce);
						quantity = reduceItem;
					}else if (reduceItem == 0) {
						rackItemDao.delete(rackReduce);
						break;
					}else {
						quantity = reduceItem;
					}
					
				}			
			}else {
				rackItem.setQuantity(quantity);
				rackItemDao.save(rackItem);
			}
		}
//		======================================= add stok to new rack =========================================
		
		Integer addQtt = transQtt;
		LibraryItem libItem = new LibraryItem();
		Rack rack = new Rack();
		
		rack = rackDao.findById(rackIdDest).orElse(null);
		libItem = libraryItemDao.findById(itemLibId).orElse(null);
		
		System.out.println(rack);
		System.out.println();
		
		System.out.println("=====================6");
		RackItem rackItem2 = new RackItem();
//		rackItem2 = rackItemDao.findByLibItemRackId(rackId, libraryItemId)
		rackItem2 = rackItemDao.findByLibItemRackId(rackIdDest,itemLibId).stream().findFirst().orElse(null); 
		System.out.println(rackItem2);
		System.out.println("=====================7");
		//System.out.println(authorId);
		if(rackItem2 != null) {
			// add quantity
			addQtt += rackItemDao.findQuantityById(rackIdDest, itemLibId);
			rackItem2.setQuantity(addQtt);
			rackItemDao.save(rackItem2);
		}else if (rack != null){
			// add new rack
			System.out.println("============8");
			RackItem rackItem3 = new RackItem();
			rackItem3.setLibraryItem(libraryItemDao.findById(itemLibId).get());
			rackItem3.setRack(rackDao.findById(rackIdDest).get());
			System.out.println(rackItem3);
			rackItemDao.save(rackItem3);
			rackItem3.setQuantity(addQtt);
			
			System.out.println("Table Rack Telah ditambahkan");
		}

	}
}
	