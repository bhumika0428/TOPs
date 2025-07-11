package Pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class EmployeeDetails {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int EmployeeId;
	@Override
	public String toString() {
		return "EmployeeDetails [EmployeeId=" + EmployeeId + ", "
				+ (EmployeeName != null ? "EmployeeName=" + EmployeeName + ", " : "")
				+ (Salary != null ? "Salary=" + Salary + ", " : "") + (Phone != null ? "Phone=" + Phone + ", " : "")
				+ (Email != null ? "Email=" + Email + ", " : "") + (Gender != null ? "Gender=" + Gender + ", " : "")
				+ (departmentDetails != null ? "departmentDetails=" + departmentDetails + ", " : "")
				+ (profileDetails != null ? "profileDetails=" + profileDetails + ", " : "")
				+ (projectDetails != null ? "projectDetails=" + projectDetails : "") + "]";
	}
	public DepartmentDetails getDepartmentDetails() {
		return departmentDetails;
	}
	public void setDepartmentDetails(DepartmentDetails departmentDetails) {
		this.departmentDetails = departmentDetails;
	}
	public ProfileDetails getProfileDetails() {
		return profileDetails;
	}
	public void setProfileDetails(ProfileDetails profileDetails) {
		this.profileDetails = profileDetails;
	}
	
	public List<ProjectDetails> getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(List<ProjectDetails> projectDetails) {
		this.projectDetails = projectDetails;
	}

	private String EmployeeName;
	private String Salary;
	private Long Phone;
	private String Email;
	private String Gender;
	
	@ManyToOne
	@JoinColumn(name="DepartmentId")
	private DepartmentDetails departmentDetails;
	
	 @OneToOne
	 private ProfileDetails profileDetails;
	  
		/*
		 * @ManyToMany
		 * 
		 * 
		 * @JoinTable( name = "employee_project", joinColumns = @JoinColumn(name =
		 * "employee_id"), inverseJoinColumns = @JoinColumn(name = "project_id") )
		 * 
		 */
	 @ManyToMany
	 private List<ProjectDetails> projectDetails;
	 
	
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
}
