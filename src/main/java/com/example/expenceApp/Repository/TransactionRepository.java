package com.example.expenceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expenceApp.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    
}
