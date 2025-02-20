package ConstructorandSetterDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorinjection.student;

public class app {

	public static void main(String[] args) {
		
		System.out.println("hello");
		ApplicationContext con = new ClassPathXmlApplicationContext("ConstructorandSetterDependencyInjection/bean.xml");
		Student obj=(Student) con.getBean("s");
		System.out.println(obj);
		
		Subject obj1=(Subject) con.getBean("s1");
		System.out.println(obj1);
	}
}
