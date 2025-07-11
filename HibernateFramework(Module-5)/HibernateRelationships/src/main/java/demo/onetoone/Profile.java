package demo.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profiledetails")
public class Profile {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private String age;
	private String moblie;
	private String address;
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	 Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Profile(int profileId, String name, String age, String moblie, String address, User user) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.age = age;
		this.moblie = moblie;
		this.address = address;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", age=" + age + ", moblie=" + moblie
				+ ", address=" + address + ", user=" + user + "]";
	}
	
	
}
