package com.trieka.library.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.trieka.library.entity.Author;

public interface AuthorDao extends CrudRepository<Author, Long>{

}
