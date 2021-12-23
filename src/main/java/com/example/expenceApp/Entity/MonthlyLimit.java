package com.example.expenceApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MonthlyLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private float monthlyLimit;
	private String defaultCurrency;
	@OneToOne
	private User user;
	
	public MonthlyLimit() {
		
	}
	public MonthlyLimit(float monthlyLimit, String defaultCurrency) {

		this.monthlyLimit = monthlyLimit;
		this.defaultCurrency = defaultCurrency;
	}
	
	public float getMonthlyLimit() {
		return monthlyLimit;
	}
	
	public void setMonthlyLimit(float monthlyLimit) {
		this.monthlyLimit = monthlyLimit;
	}
	
	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}
	public Long getId() {
	    return id;
	}
	public void setId(Long id) {
	    this.id = id;
	}
	
	
}
