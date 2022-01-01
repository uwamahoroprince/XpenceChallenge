package com.example.expenceApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenceApp.Entity.Transaction;
import com.example.expenceApp.Service.TransactionService;

@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("/Transaction")
    public Transaction postTransaction(@RequestBody Transaction transaction) {
	return transactionService.postTransaction(transaction);
    }
    @GetMapping("/Transactions")
    public List<Transaction> getAllTransaction(){
	return transactionService.getAllTransactions();
    }
    @CrossOrigin
    @DeleteMapping("/Transaction/{id}")
    public String deleteTransaction(@PathVariable("id") Long id) {
	String msg = "DELETED";
	try {
	    transactionService.DeleteTransaction(id);
	} catch (Exception e) {
	    System.out.println("ERROR is "+ e.getMessage());
	    msg="NOT DELETED";
	}
	return msg;
    }
    @PutMapping("Transaction/{id}")
    public Transaction updateTransaction(@PathVariable("id") Long id, @RequestBody Transaction transaction) {
	Transaction tra = transactionService.findTransactionById(id);
	tra.setAmount(transaction.getAmount());
	tra.setDescription(transaction.getDescription());
	tra.setAccount(transaction.getAccount());
	tra.setCategory(transaction.getCategory());
	return transactionService.UpdateTransaction(tra);
    }
}
