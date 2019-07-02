package com.eksad.supermarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.eksad.supermarket.entity.Transaction;

public interface TransactionDao extends CrudRepository<Transaction, Long>{

}
