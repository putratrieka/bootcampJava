package com.trieka.library.dao;

import org.springframework.data.repository.CrudRepository;

import com.trieka.library.entity.LibraryItem;

public interface LibraryItemDaoo extends CrudRepository<LibraryItem, Long>{
	// =============== find library_item by name =======================
//	@Query("select li "
//			+ "from LibraryItem li "
//			+ "join li.author au "
//			//+ "group by li.libraryItem.id "
//			+ "where au.name = :name")
//	public  String findLibraryItemByName(@Param("name") String name);
	/* ==== native query ====
	Select * from library_item li
	join author au on au.id = li.author_id
	where au.name = 'Jack Fulan'
	 */
}
