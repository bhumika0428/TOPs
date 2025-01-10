package ClassesandObjects;

public class Student {

	private int studentId;
	private String studentName;
	private int studentage;
	public Student(int studentId, String studentName, int studentage) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentage = studentage;
	}
	
	public void display()
	{
		System.out.println("Student ID  :-"+studentId);
		System.out.println("student Name :-"+studentName);
		System.out.println("student Age :-"+studentage);
	}
	
	public static void main(String[] args) {
		 
		Student obj=new Student(28, "bhumika chauhan", 25);
		obj.display();
	}
}

