package com.eksad.assignmentjpa.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Book extends LibraryItem{
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	private String isbn;
}
