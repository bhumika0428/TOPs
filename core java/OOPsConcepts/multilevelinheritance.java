package OOPsConcepts;
class animal
{
 public	void eat()
	{
		System.out.println("eating...");
	}
}
class dog extends animal
{
	public void bark()
	{
		System.out.println("barking..");
	}

}
class puppy extends dog
{
	public void play()
	{
		System.out.println("playing.");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		
		puppy obj=new puppy();
		obj.eat();
		obj.bark();
		obj.play();
	}
}
