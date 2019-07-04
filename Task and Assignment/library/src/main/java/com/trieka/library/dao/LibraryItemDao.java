package com.trieka.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trieka.library.entity.LibraryItem;

public interface LibraryItemDao extends JpaRepository<LibraryItem, Long>{
	// =============== find library_item by name =======================
	@Query("select li "
			+ "from LibraryItem li "
			+ "join li.author au "
			//+ "group by li.libraryItem.id "
			+ "where au.name = :name")
	public List<LibraryItem>findLibraryItemByName(@Param("name") String name);
	/* ==== native query ====
	Select * from library_item li
	join author au on au.id = li.author_id
	where au.name = 'Jack Fulan'
	 */
}
