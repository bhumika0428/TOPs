package com.tops.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;
	private String Username;
	private String Email;
	private String Password;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [UserId=" + UserId + ", Username=" + Username + ", Email=" + Email + ", Password="
				+ Password + "]";
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(int userId, String username, String email, String password) {
		super();
		UserId = userId;
		Username = username;
		Email = email;
		Password = password;
	}
	
	 
}
