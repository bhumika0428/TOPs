package ConstructorsandDestructors;

public class person {

	private int id;
	private String name;
	private int age;
	public person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void diplay()
	{
		System.out.println("Person Id:-"+id);
		System.out.println("Person Name:-"+name);
		System.out.println("person Age:-"+age);
	}
	
	public static void main(String[] args) {
		person obj=new person(1, "bhumi", 25);
		obj.diplay();
	}
}
