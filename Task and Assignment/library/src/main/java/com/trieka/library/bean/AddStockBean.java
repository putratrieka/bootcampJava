//package com.trieka.library.bean;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.trieka.library.dao.AuthorDao;
//import com.trieka.library.dao.LibraryItemDao;
//import com.trieka.library.dao.RackDao;
//import com.trieka.library.dao.RackItemDao;
//import com.trieka.library.entity.Author;
//import com.trieka.library.entity.LibraryItem;
//import com.trieka.library.entity.Rack;
//import com.trieka.library.entity.RackItem;
//
//@Configuration
//public class AddStockBean {
//	
//	@Autowired
//	private AuthorDao authorDao;
//	
//	@Autowired
//	private LibraryItemDao libraryItemDao;
//	
//	@Autowired
//	private RackItemDao rackItemDao;
//	
//	@Autowired
//	private RackDao rackDao;
//	
////	Author author = new Author();
////	author.setId(1L);
////	Rack rack1 = new Rack();
////	LibraryItem item = new LibraryItem();
////	
////	rack1.setCode("North-01");
////	item.setTitle("Icha Icha Paradise");
////	item.setType("Book");
////	item.setAuthor(author);
////	item.setIsbn("1245398461579");
////	
////	Integer quantity = 2;
////
//////	@Bean
////	AddStockBean addStroctBean = new AddStockBean();
////	addStroctBean.addStock(rack1, item, quantity);
//	
//	@Bean
//	public void addStock(Rack rack, LibraryItem item, Integer quantity) {
//			
//		
//			//Integer quantity = 2;
////			Long rackId = rack.getId();
//			
//			RackItem rackItem = new RackItem();
//			LibraryItem libItem = new LibraryItem();
//			
//			Long libraryItemId = libraryItemDao.findIdByTitle(item.getTitle()).stream().findFirst().orElse(null);
//			Long rackId = rackDao.findIdByCode(rack.getCode()).stream().findFirst().orElse(null);
//			
////			=================== Find Library Item Id and RAck Id
//			
//			rackItem = rackItemDao.findByLibItemRackId(rackId,libraryItemId).stream().findFirst().orElse(null); 
//			
//			if(rackItem != null) {
//				quantity += rackItemDao.findQuantityById(rackId, libraryItemId);
//				rackItem.setQuantity(quantity);
//				rackItemDao.save(rackItem);
//			}
//
//	}
//	
////	Rack rack1 = new Rack();
////	LibraryItem item = new LibraryItem();
////	
//	
////	rack1.setCode("North-01");
////	item.setTitle("Icha Icha Paradise");
////	item.setType("Book");
////	item.setAuthorId(1L);
////	item.setIsbn("1245398461579");
//	
//
//}
