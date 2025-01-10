package PackagesandAccessModifiers;

public class accessmodifiers {

	public int a =10;
	protected int b=20;
	private int c=30;
	int d=40;
	
	public void publicmethod()
	{
		System.out.println("publicmethod");
	}
	public void protectedmethod()
	{
		System.out.println("protectedmethod");
	}
	public void privatemethod()
	{
		System.out.println("privatemethod");
	}
	void defaultmethod()
	{
		System.out.println("defaultmethod");
	}
	public void printfield()
	{
		System.out.println("public"+a);
		System.out.println("protected"+b);
		System.out.println("private"+c);
		System.out.println("default");
		
	}
}
