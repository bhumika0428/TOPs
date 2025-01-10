package InheritanceandPolymorphism;

public class Animal {

	
	public String name;
	public Animal( String name) {
		super();
		
		this.name = name;
	}
	public void speak()
	{
		System.out.println(name+"make a sound");
		
	}
}

 class Dog extends Animal
{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	 public void speak()
	 {
		 System.out.println(name+"make a sound");
	 }
}
 class Main{
	 public static void main(String[] args) {
		Animal obj=new Animal("animal");
		obj.speak();
		
		Dog dog=new Dog("buddy");
		dog.speak();
		
	}
 }