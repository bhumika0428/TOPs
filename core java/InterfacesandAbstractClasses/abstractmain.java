package InterfacesandAbstractClasses;
abstract class Animal
{
	abstract void sound();
	void sleep()
	{
		System.out.println("this animal is sleep");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("dog is barks");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat is barks");
	}
}
public class abstractmain {

	public static void main(String[] args) {
		
		Animal dobj=new Dog();
		dobj.sound();
		dobj.sleep();
		Animal cobj=new Cat();
		cobj.sound();
		cobj.sleep();
	}
}
