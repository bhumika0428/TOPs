package ClassesandObjects;

public class constructorDemo {

	private int Id;
	private String Name;
	private String Subject;
	private int age;
	public constructorDemo(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public constructorDemo(int id, String name, String subject) {
		super();
		Id = id;
		Name = name;
		Subject = subject;
	}
	public constructorDemo(int id, String name, String subject, int age) {
		super();
		Id = id;
		Name = name;
		Subject = subject;
		this.age = age;
	}
	
	
	public void display()
	{
		System.out.println("Enter the Id :-"+Id );
		System.out.println("Enter the Name:-"+Name);
		System.out.println("Enter the Age:-"+age);
		System.out.println("Enter the Subject :-"+Subject);
		
	}
	public static void main(String[] args) {
		
		System.out.println("two parameter");
		constructorDemo obj1=new constructorDemo(1,"bhumi");
		obj1.display();
		System.out.println("three parameter");
		constructorDemo obj2=new constructorDemo(2, "sahin","java");
		obj2.display();
		System.out.println("four parameter");
		constructorDemo obj3=new constructorDemo(2, "sahin","java",25);
		obj3.display();
	}
	
	
	
}
