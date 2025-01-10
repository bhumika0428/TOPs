package OOPsConcepts;

class Animal
{
	void eat()
	{
		System.out.println("eatting");
	}
} 
class Dog  extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		
	}
}
