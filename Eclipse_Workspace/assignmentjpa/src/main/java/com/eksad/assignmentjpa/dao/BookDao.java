package com.eksad.assignmentjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eksad.assignmentjpa.entity.Author;
import com.eksad.assignmentjpa.entity.Book;

public interface BookDao extends CrudRepository<Book, Long>{
	
	
	public List<Book>findByIsbn(String isbn);
	
	public List<Book>findByAuthor(Author author);
	
	
}
