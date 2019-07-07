package com.eksad.supermarket;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDao;
import com.eksad.supermarket.dao.ChasierDao;
import com.eksad.supermarket.dao.CustomerDao;
import com.eksad.supermarket.dao.PersonDao;
import com.eksad.supermarket.dao.ProductDao;
import com.eksad.supermarket.dao.ProductElectronicDao;
import com.eksad.supermarket.dao.ProductGroceryDao;
import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.Transaction;
import com.eksad.supermarket.entity.TransactionDetail;

@SpringBootApplication
public class SupermarketApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
	}
	
	@Autowired
	private BrandDao brandDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Autowired
	private ChasierDao chasierDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ProductElectronicDao productElectronicDao;
	
	@Autowired
	private ProductGroceryDao productGroceryDao;
	
	@Override
	@Transactional // agar method berjalan dalam satu koneksi, apabila satu method gagal, akan di rollback.
	public void run(ApplicationArguments args) throws Exception{
//		System.out.println("===================================================");
//		System.out.println(transactionDao.findTotalItemByTransactionId((long) 1));
//		
		System.out.println("===================================================");
		List<Object[]> totals = transactionDao.findTotalNominalByTransaction();
		
		for (Object[] total : totals) {
			System.out.println("id : " + total[0]);
			System.out.println("total : " + total[1]);
		}
		
		
//		System.out.println("=============Product Electronic=============");
//		productElectronicDao.findAll().forEach(System.out::println);
//		System.out.println("=============Product Grocery=============");
//		productGroceryDao.findAll().forEach(System.out::println);
//		System.out.println("=============Product=============");
//		productDao.findAll().forEach(System.out::println);
		
//=============================================================	
//		System.out.println("=============Chasier=============");
//		chasierDao.findAll().forEach(System.out::println);
//		System.out.println("=============Customer=============");
//		customerDao.findAll().forEach(System.out::println);
		
//=============================================================		
//		Brand brand1 = new Brand();
//		brand1.setName("Brand test #1");
//		brand1.setProductType("Test #1");
//		brandDao.save(brand1);
////		
////		String bikinError = null;
////		bikinError.toString();
//		
//		Brand brand2 = new Brand();
//		brand2.setName("Brand test #2");
//		brand2.setProductType("Test #2");
//		brandDao.save(brand2);	
		
//		productDao.findAll().forEach(System.out::println);
		/*
		// upadate Table
		Brand brand = brandDao.findByName("Nestle")
				.stream()
				.findFirst()
				.orElse(null);
		if (brand != null) {
			brand.setProductType("Food and Drink");
			brandDao.save(brand);
		}
		brandDao.findAll().forEach(System.out::println);
		*/
		//=========== insert table ================
/*		Product product = new Product();
		Brand brand = brandDao.findById(1L).get();
		product.setName("Cimory Coklat");
		product.setPrice(new BigDecimal(15000));
		product.setBrand(brand);
		
		productDao.save(product);

		//=========== select table ================
		productDao.findAll()
			.forEach(System.out::println);
*/
		
//		============ One to One ==============	
/*		
		Person person = new Person();
		person.setName("Jane Fulan");
		
		PersonAddress address = new PersonAddress();
		address.setAddress("Kebun Raya");
		address.setCity("Bogor");
		
		person.setAddress(address);
		address.setPerson(person);
		
		personDao.save(person);
			
		personDao.findAll()
			.forEach(System.out::println);
*/		
//		============ One to Many ==============

		Transaction transaction = new Transaction();
		transaction.setDate(new Date());
		transaction.setRemark("Test Transaction");
		transaction.setDetail(new HashSet<TransactionDetail>());
		
		TransactionDetail detail1 = new TransactionDetail();
		detail1.setProduct(productDao.findById((long) 1).get());
		//detail1.setProduct(productDao.findById((long) 1).get());
		detail1.setQuantity(3);
		detail1.setTransaction(transaction);
		transaction.getDetail().add(detail1);
		
		TransactionDetail detail2 = new TransactionDetail();
		detail2.setProduct(productDao.findById((long) 2).get());
		detail2.setQuantity(5);
		detail2.setTransaction(transaction);
		transaction.getDetail().add(detail2);
		
//		transactionDao.save(transaction);	
		
	
//		Transaction transaction = transactionDao.findById(2L).get();
//		System.out.println("==== DONE GET TRANS ====");
//		transaction.getDetail().size();
//		transactionDao.findAll()
//		.forEach(System.out::println);
		

		
	}

}
