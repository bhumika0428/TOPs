package demo.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courseinfo")
public class Courseinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String fees;
	private String durtion;
	@ManyToMany
	 private List<Studentinfo> studentinfos;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getDurtion() {
		return durtion;
	}
	public void setDurtion(String durtion) {
		this.durtion = durtion;
	}
	public List<Studentinfo> getStudentinfos() {
		return studentinfos;
	}
	public void setStudentinfos(List<Studentinfo> studentinfos) {
		this.studentinfos = studentinfos;
	}
	@Override
	public String toString() {
		return "Courseinfo [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", durtion="
				+ durtion + ", studentinfos=" + studentinfos + "]";
	}
	
	
	
	
}
