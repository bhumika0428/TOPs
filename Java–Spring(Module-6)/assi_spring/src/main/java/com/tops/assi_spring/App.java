package com.tops.assi_spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tops/assi_spring/confing.xml");
        // Get the bean and call its method
        MyBean myBean = (MyBean) context.getBean("a");
        myBean.sayHello();
        
    }
}
