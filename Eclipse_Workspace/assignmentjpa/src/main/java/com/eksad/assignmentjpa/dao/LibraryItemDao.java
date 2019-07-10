package com.eksad.assignmentjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eksad.assignmentjpa.entity.LibraryItem;

public interface LibraryItemDao extends CrudRepository<LibraryItem, Long>{
	
	public List<LibraryItem>findByTitle(String title);
	
	
	
	
	
	
}
