package demo.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "userdetails")
public class User {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	private int userId;
	private String username;
	@OneToOne
	private Profile profile;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	private User(int userId, String username, Profile profile) {
		super();
		this.userId = userId;
		this.username = username;
		this.profile = profile;
	}
	User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", profile=" + profile + "]";
	}
	
	
	
	
}
