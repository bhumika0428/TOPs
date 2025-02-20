package BeanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopes/bean.xml");

       
        Employee obj=(Employee) context.getBean("emp");
        System.out.println(obj);
        department dobj=(department)context.getBean("dep");
       System.out.println(dobj); 
        
	}
}
