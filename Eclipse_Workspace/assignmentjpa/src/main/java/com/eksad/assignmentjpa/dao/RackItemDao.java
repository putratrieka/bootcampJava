package com.eksad.assignmentjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eksad.assignmentjpa.entity.LibraryItem;
import com.eksad.assignmentjpa.entity.Rack;
import com.eksad.assignmentjpa.entity.RackItem;

public interface RackItemDao extends CrudRepository<RackItem, Long>{
	
	@Query("select rack.id, sum(quantity) "
			+ "from RackItem "
			+ "group by rack.id ")
	public List<Object[]>countPerRack();
	
	public RackItem findByRackAndLibraryItem(Rack rack,LibraryItem librariItem);
}
