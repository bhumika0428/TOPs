package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProfileDetails")
public class ProfileDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int profileId;
	private String photo;
	@OneToOne 
	private EmployeeDetails employeeDetails ;
	
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	@Override
	public String toString() {
		return "ProfileDetails [profileId=" + profileId + ", " + (photo != null ? "photo=" + photo + ", " : "")
				+ (employeeDetails != null ? "employeeDetails=" + employeeDetails : "") + "]";
	}
	
	
}
