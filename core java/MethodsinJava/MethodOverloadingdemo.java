package MethodsinJava;

public class MethodOverloadingdemo {

	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(Double a,Double b)
	{
		 return a+b;
	}
	public String add(String a,String b)
	{
		return a+b;
	}
 	public static void main(String[] args) {
		MethodOverloadingdemo obj=new MethodOverloadingdemo();
		int intResult= obj.add(23, 78);
		System.out.println(intResult);
		double doubleResult=obj.add(78.6, 34.9);
		System.out.println(doubleResult);
		
		String stringResult =obj.add("bhumi", "chauhan");
		System.out.println(stringResult);
	}
}
