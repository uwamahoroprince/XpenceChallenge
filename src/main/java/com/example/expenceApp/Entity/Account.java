package com.example.expenceApp.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String currency;
private String description;
@OneToMany(mappedBy = "account")
private List<Transaction> transaction;
@ManyToOne
private User user;

public Account() {

}

public Account(String name, String currency, String description) {
	this.name = name;
	this.currency = currency;
	this.description = description;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public List<Transaction> getTransaction() {
    return transaction;
}

public void setTransaction(List<Transaction> transaction) {
    this.transaction = transaction;
}


}
