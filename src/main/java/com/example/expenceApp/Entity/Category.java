package com.example.expenceApp.Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private TransactionType transactionType;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public TransactionType getTransactionType() {
	return transactionType;
}
public void setTransactionType(TransactionType transactionType) {
	this.transactionType = transactionType;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}


}
