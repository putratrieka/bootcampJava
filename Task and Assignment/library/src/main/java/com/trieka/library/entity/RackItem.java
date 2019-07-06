package com.trieka.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "rack_item")
public class RackItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rack_id",nullable = false)
	private Long rackId;
	
	@Column(name = "library_item_id",nullable = false)
	private Long libraryItemId;
	
	@Column(nullable = false)
	private int quantity;
}