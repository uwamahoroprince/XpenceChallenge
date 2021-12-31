package com.example.expenceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenceApp.Entity.Transaction;
import com.example.expenceApp.Repository.TransactionRepository;

@Service
public class TransactionImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepo;
    @Override
    public Transaction postTransaction(Transaction transaction) {
	// TODO Auto-generated method stub
	return transactionRepo.save(transaction);
    }
    @Override
    public List<Transaction> getAllTransactions() {
	// TODO Auto-generated method stub
	return transactionRepo.findAll();
    }
    @Override
    public void DeleteTransaction(Long id) {
	transactionRepo.deleteById(id);
	
    }
    @Override
    public Transaction UpdateTransaction(Transaction transaction) {
	// TODO Auto-generated method stub
	return transactionRepo.save(transaction);
    }
    @Override
    public Transaction findTransactionById(Long id) {
	// TODO Auto-generated method stub
	return transactionRepo.findById(id).get();
    }


    
}
