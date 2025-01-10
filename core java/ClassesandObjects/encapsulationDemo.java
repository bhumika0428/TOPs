package ClassesandObjects;

public class encapsulationDemo {

	private int Id;
	private String Name;
	private String Subject;
	private int Age;
	
	public int getId() {
		return Id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		 if (Age >= 0) {  // Ensuring age is non-negative
	            this.Age = age;
	        } else {
	            System.out.println("Age cannot be negative.");
	        }
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	public void display()
	{
		System.out.println("Enter the Id :-"+Id);
		System.out.println("Enter the Name :-"+Name);
		System.out.println("Enter the Subject:-"+Subject);
		System.out.println("Enter the Age:-"+Age);
	}
	public static void main(String[] args) {
		
		encapsulationDemo obj=new encapsulationDemo();
		obj.setId(1);
		obj.setName("bhumi");
		obj.setSubject("java");
		obj.setAge(25);
		
		
		obj.display();
	}

}
