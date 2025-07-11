package Pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DepartmentDetails")
public class DepartmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DepartmentId;
	private String DepartmentName;
	@OneToMany  (mappedBy = "departmentDetails", cascade=CascadeType.ALL, fetch = FetchType.EAGER ) 
	private List<EmployeeDetails> employeeDetails;
	
	public List<EmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	@Override
	public String toString() {
		return "DepartmentDetails [DepartmentId=" + DepartmentId + ", "
				+ (DepartmentName != null ? "DepartmentName=" + DepartmentName + ", " : "")
				+ (employeeDetails != null ? "employeeDetails=" + employeeDetails : "") + "]";
	}
	
	
}
