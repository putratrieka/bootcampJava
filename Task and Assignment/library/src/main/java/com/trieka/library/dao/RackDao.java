package com.trieka.library.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trieka.library.entity.Rack;

public interface RackDao {
	
	public List<Rack>findById(Long rackId);
	
	public List<Rack> getAll();
		
	public Rack getById(int id);
	
	public void save(Rack rack);
	
	public void update(Rack rack);
	
	public void delete(int id);
	

}
