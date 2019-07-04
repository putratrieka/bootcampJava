package com.trieka.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.trieka.library.entity.LibraryItem;

public interface LibraryItemDao extends CrudRepository<LibraryItem, Long>{
	@Query("select li "
		+ "from LibraryItem li "
		+ "join li.author au "
		//+ "group by li.libraryItem.id "
		+ "where au.name = :name")
	public List<LibraryItem> findLibraryItemByName(@Param("name") String name);
	//_________________________________________________________________________
	
	@Query("select li.title, "
				+ "li.type "
			+ "from LibraryItem li "
			+ "where li.isbn = :isbn")
	public List<Object[]> findLibraryItemByIsbn(@Param("isbn")String isbn);
	
	//_________________________________________________________________________
	@Query("select li.title, "
			+ "li.type "
		+ "from LibraryItem li "
		+ "where li.isbn = :isbn")
	public List<Object[]> findLibraryItemByAuthor(@Param("isbn")String isbn);
}
/* ==== native query ====
	Select * from library_item li
	join author au on au.id = li.author_id
	where au.name = 'Jack Fulan'
 */
