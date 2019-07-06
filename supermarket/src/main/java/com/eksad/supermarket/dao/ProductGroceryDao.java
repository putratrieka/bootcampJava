package com.eksad.supermarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.eksad.supermarket.entity.Product;
import com.eksad.supermarket.entity.ProductGrocery;

public interface ProductGroceryDao extends CrudRepository<ProductGrocery, Long>{
	
}
