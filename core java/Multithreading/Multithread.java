package Multithreading;

class mythread extends Thread {
	public void run()
	{
		System.out.println("Thread is called :- "+ Thread.currentThread().getName());
	}

}
public class Multithread 
{
	public static void main(String[] args) {
		
		mythread thread1=new mythread();
		mythread thread2=new mythread();
		
		mythread thread3=new mythread();
		 thread1.start();
		 thread2.start();
		 thread3.start();
	}
	
}
