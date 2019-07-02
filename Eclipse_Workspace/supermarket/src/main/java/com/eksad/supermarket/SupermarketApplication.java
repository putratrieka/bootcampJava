package com.eksad.supermarket;

import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eksad.supermarket.dao.BrandDao;
import com.eksad.supermarket.dao.PersonDao;
import com.eksad.supermarket.dao.ProductDao;
import com.eksad.supermarket.dao.TransactionDao;
import com.eksad.supermarket.entity.Person;
import com.eksad.supermarket.entity.PersonAddress;
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
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		
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
		detail1.setQuantity(3);
		detail1.setTransaction(transaction);
		transaction.getDetail().add(detail1);
		
		TransactionDetail detail2 = new TransactionDetail();
		detail2.setProduct(productDao.findById((long) 2).get());
		detail2.setQuantity(5);
		detail2.setTransaction(transaction);
		transaction.getDetail().add(detail2);
		
		transactionDao.save(transaction);	
//		transactionDao.findAll()
//		.forEach(System.out::println);
		
	}

}
