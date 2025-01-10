package OOPsConcepts;

class animal1
{
	public void sound()
	{
		System.out.println("Some generic animal sound");
	}
}

class dog1 extends animal1
{
	public void sound()
	{
		System.out.println("Dog barks");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		animal1 obj=new animal1();
		animal1 obj1=new dog1();
		obj.sound();
		obj1.sound();
	}
}
