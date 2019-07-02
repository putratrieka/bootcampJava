package com.eksad.supermarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//@Getter @Setter // auto add Getter Setter method (harus install lombok terlebih dahulu)
//@EqualsAndHashCode
//===atau
@Data
//=================
@Entity
@Table(name ="Brand")

public class Brand {
	@Id
	@GeneratedValue // auto increment
	private Long id;
	
	@Column(nullable = false)// not null
	private String name;
	
	@Column(name = "product_type")
	private String productType;
}
