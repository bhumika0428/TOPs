package BeanFactoryandApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.top.spring.core.student;

public class main {

	public static void main(String[] args) {
		System.out.println("hello");
		 ApplicationContext con = new ClassPathXmlApplicationContext("com/top/spring/core/confing.xml");
			student s1 = (student)con.getBean("stud1");
			System.out.println(s1);
	}
}
