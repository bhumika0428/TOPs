package InheritanceandPolymorphism;

class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 7.9f;
	}
}
class AXIS extends Bank
{
	float getRateOfInterest()	{
		return 9.9f;
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		
		Bank obj;
		obj= new SBI();
		System.out.println("sbi interest :-"+obj.getRateOfInterest());
		obj=new ICICI();
		System.out.println("icici interest :-"+obj.getRateOfInterest());
		obj= new AXIS();
		System.out.println("axis interest :-"+obj.getRateOfInterest());

	
	}
}
