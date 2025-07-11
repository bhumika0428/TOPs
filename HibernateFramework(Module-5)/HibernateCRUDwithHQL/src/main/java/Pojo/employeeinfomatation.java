package Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeinfomatation")
public class employeeinfomatation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EmployeeId;
	private String EmployeeName;
	private String Salary;
	private String Email;
	private String moblie;
	@ManyToOne
	@JoinColumn(name="DepartmentId")
	private departmentinfomatation departmentInfo;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
	public departmentinfomatation getDepartmentInfo() {
		return departmentInfo;
	}
	public void setDepartmentInfo(departmentinfomatation departmentInfo) {
		this.departmentInfo = departmentInfo;
	}
	@Override
	public String toString() {
		return "employeeinfomatation [EmployeeId=" + EmployeeId + ", "
				+ (EmployeeName != null ? "EmployeeName=" + EmployeeName + ", " : "")
				+ (Salary != null ? "Salary=" + Salary + ", " : "") + (Email != null ? "Email=" + Email + ", " : "")
				+ (moblie != null ? "moblie=" + moblie + ", " : "")
				+ (departmentInfo != null ? "departmentInfo=" + departmentInfo : "") + "]";
	}
	
	
}
