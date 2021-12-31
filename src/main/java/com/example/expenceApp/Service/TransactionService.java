package com.example.expenceApp.Service;

import java.util.List;

import com.example.expenceApp.Entity.Transaction;

public interface TransactionService {
public Transaction postTransaction(Transaction transaction);
public List<Transaction> getAllTransactions();
public void DeleteTransaction(Long id);
public Transaction UpdateTransaction(Transaction transaction);
public Transaction findTransactionById(Long id);
}
