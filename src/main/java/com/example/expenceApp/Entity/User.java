package com.example.expenceApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String email;
private String name;
private String phoneNumber;
private String password;
private String profilePicture;


public User() {
	
}

public User(String email, String name, String phoneNumber, String password, String profilePicture) {
	this.email = email;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.password = password;
	this.profilePicture = profilePicture;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getProfilePicture() {
	return profilePicture;
}

public void setProfilePicture(String profilePicture) {
	this.profilePicture = profilePicture;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}


}
