package Pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectDetails")
public class ProjectDetails {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
	private int projectId;
	private String projectName;
	private String projectDetails;
	private String projectStatus;
	private String StartDate;
	private String EndDate;
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getProjectLanguage() {
		return projectLanguage;
	}
	public void setProjectLanguage(String projectLanguage) {
		this.projectLanguage = projectLanguage;
	}
	private String projectLanguage;
	
	@ManyToMany/*(mappedBy = "projectDetails" )*/
	private List<EmployeeDetails> employeeDetails;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public List<EmployeeDetails> getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", "
				+ (projectName != null ? "projectName=" + projectName + ", " : "")
				+ (projectDetails != null ? "projectDetails=" + projectDetails + ", " : "")
				+ (projectStatus != null ? "projectStatus=" + projectStatus + ", " : "")
				+ (StartDate != null ? "StartDate=" + StartDate + ", " : "")
				+ (EndDate != null ? "EndDate=" + EndDate + ", " : "")
				+ (projectLanguage != null ? "projectLanguage=" + projectLanguage + ", " : "")
				+ (employeeDetails != null ? "employeeDetails=" + employeeDetails : "") + "]";
	}
	
	
	
	
}
