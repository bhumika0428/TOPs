package com.tops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class admininfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "admininfo [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	public admininfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admininfo(int id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
	
}
