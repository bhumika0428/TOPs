package ConstructorsandDestructors;

public class personCMOL {

	private int id;
	private String name;
	private int age;
	private String subject;
	public personCMOL(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.subject = "Not Provided";
		
	}
	public personCMOL(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	public personCMOL(int id, String name, int age, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	
	public void display()
	{
		System.out.println("enter the id:-"+id);
		System.out.println("enter the name:-"+name);
		System.out.println("enter the age:-"+age);
		System.out.println("enter the subject:-"+subject);
	}
	
	public static void main(String[] args) {
		personCMOL obj1=new personCMOL(1,"bhumi");
		personCMOL obj2=new personCMOL(2, "sahin", "java");
		personCMOL obj3=new personCMOL(1, "nammu", 25,".net");
		System.out.println("person 1");
		obj1.display();
		System.out.println("person 2");
		obj2.display();
		System.out.println("person 3");
		obj3.display();
		
	}
}

