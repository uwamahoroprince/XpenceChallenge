package com.example.expenceApp.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Transaction {

@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private double amount;
 private String description;
 @ManyToOne
 private Category category;
 @ManyToOne
 private Account account;
 private  LocalDate createdAt = LocalDate.now();
 
 
 public Transaction() {

}

public Transaction(double amount, String description, Category category, Account account,
		TransactionType transactionType) {
	super();
	this.amount = amount;
	this.description = description;
	this.category = category;
	this.account = account;
	
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public  LocalDate getCreatedat() {
    return createdAt;
}
public LocalDate getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
}
 
 
}
