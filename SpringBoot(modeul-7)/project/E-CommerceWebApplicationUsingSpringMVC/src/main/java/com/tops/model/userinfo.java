package com.tops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class userinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String username;
	private String email;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
		return "userinfo [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	protected userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected userinfo(int userid, String username, String email, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
}
