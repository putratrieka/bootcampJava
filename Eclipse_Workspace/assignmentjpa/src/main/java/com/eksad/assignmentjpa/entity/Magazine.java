package com.eksad.assignmentjpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)//agar memperhitugkan properti dari super class
@ToString(callSuper = true)// agar menikutsertakan properti superclass ketika di running
@Entity
public class Magazine extends LibraryItem{
	
	@Column(name = "publish_date")
	@Temporal(TemporalType.DATE)
	private Date publishDate;

}
