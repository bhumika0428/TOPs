package MethodsinJava;

public class Counter {

	static int count=0;
	
	 Counter()
	{
		count++;
		//System.out.println(count);
	}
	public static void display()
	{
		System.out.println("Counter:-"+count);
	}
	public static void restart()
	{
		count=0;
		System.out.println("restart Counter:-"+count);
	}
	public static void main(String[] args) {
		
		Counter.display();
		
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		
		Counter.display();
		
		Counter.restart();
		Counter.display();
	}
}
