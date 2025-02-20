package ConstructorandSetterDependencyInjection;

public class Student {

	private String studentname;

	public Student(String studentname) {
		super();
		System.out.println("constructor called");
		
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
