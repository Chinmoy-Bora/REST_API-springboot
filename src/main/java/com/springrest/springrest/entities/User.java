package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private Long id;
	private String username;
	private String password;
	private String email;
	private String contact;
	private String gender;
	public User(long id, String username, String password, String email, String contact, String gender) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getContact()="
				+ getContact() + ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User OrElse(Object object) {
		return null;
	}
	
}
