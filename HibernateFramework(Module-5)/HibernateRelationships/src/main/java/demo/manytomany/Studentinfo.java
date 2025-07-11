package demo.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Studentinfo")
public class Studentinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String Name;
	private String Age;
	private String phone;
	@ManyToMany
	
	private List<Courseinfo> courseinfos;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Courseinfo> getCourseinfos() {
		return courseinfos;
	}
	public void setCourseinfos(List<Courseinfo> courseinfos) {
		this.courseinfos = courseinfos;
	}
	@Override
	public String toString() {
		return "Studentinfo [studentId=" + studentId + ", Name=" + Name + ", Age=" + Age + ", phone=" + phone
				+ ", courseinfos=" + courseinfos + "]";
	}
	
	
	
	
}
