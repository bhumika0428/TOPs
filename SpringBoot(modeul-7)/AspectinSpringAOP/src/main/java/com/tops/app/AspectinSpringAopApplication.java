package com.tops.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class AspectinSpringAopApplication {

	
	
	
	
	public static void main(String[] args) {
		
	ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		
		student s=con.getBean(student.class);
		s.study();
		Professor p=con.getBean(Professor.class);
		p.teaching();

	}
	
}
