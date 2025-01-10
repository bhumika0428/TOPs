package InterfacesandAbstractClasses;
interface animal
{
	void sound();
	
}
interface vehicle{
	void move();
}
interface flyable{
	void fly();
}
public class multipleinterfaces implements animal,vehicle,flyable {

	public static void main(String[] args) {
		multipleinterfaces obj=new multipleinterfaces();
		obj.sound();
		obj.fly();
		obj.move();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		 System.out.println("The flying car is flying in the sky");
		   
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		 System.out.println("The flying car moves on the road");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		 System.out.println("The flying car makes a roar sound");
	}
}
