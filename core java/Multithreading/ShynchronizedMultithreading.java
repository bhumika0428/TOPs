package Multithreading;
class sender1
{
	public void sendmsg(String msg)
	{
		System.out.println("first sender the msg :-"+msg);
		try {
			Thread.sleep(800);
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("send the msg "+ msg);
	}
}
class sender2 extends Thread
{

	String msg;
	sender1 sender1obj;
	
	public sender2(String m, sender1 obj) {
		msg=m;
		sender1obj=obj;
	}
	public void run()
	{
		synchronized (sender1obj) {
			sender1obj.sendmsg(msg);
		}
	}
}

public class ShynchronizedMultithreading {

	public static void main(String[] args) {
	
		sender1 obj1=new sender1();
		sender2 obj2=new sender2("bhumi", obj1);
		sender2 obj3=new sender2("welcome to the bhumi", obj1);
		obj2.start();
		obj3.start();
		
		try {
			
			obj2.join();
			obj3.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
	
}
