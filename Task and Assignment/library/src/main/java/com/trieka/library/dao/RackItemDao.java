package com.trieka.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trieka.library.entity.RackItem;

public interface RackItemDao extends CrudRepository<RackItem, Long>{
	

	
	@Query("select quantity from RackItem "
			+ "where rackId = :rackId "
			+ "and libraryItemId = :libraryItemId")
	public Integer findQuantityById(@Param("rackId") Long rackId,@Param("libraryItemId") Long libraryItemId);
	
	@Query("select ri from RackItem ri "
			+ "where ri.rackId = :rackId "
			+ "and ri.libraryItemId = :libraryItemId")
	
	
	public List<RackItem>findByLibItemRackId(@Param("rackId") Long rackId,@Param("libraryItemId") Long libraryItemId);
//	public List<RackItem>findByRackId(Long rackId);
	
}
