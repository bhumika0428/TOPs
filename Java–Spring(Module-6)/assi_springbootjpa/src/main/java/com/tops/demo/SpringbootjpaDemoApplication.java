package com.tops.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Model.Employee;
import repo.EmployeeDetailsRepository;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "repo") // Adjust the package name as necessary
@EntityScan(basePackages = "Model") // Adjust for your entity package

public class SpringbootjpaDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext con = SpringApplication.run(SpringbootjpaDemoApplication.class, args);

		EmployeeDetailsRepository rep = con.getBean(EmployeeDetailsRepository.class);

		
		  Employee e1 = new Employee(2,"bhumika", "it") ;
				  rep.save(e1); System.out.println("insert");
		 
			
			  List<Employee> list = rep.findAll(); 
			  System.out.println("EmployeeDetails");
			  System.out.println(list);
			  
			  System.out.println("EmployeeDetails using find by id"); 
			  Optional<Employee> id =rep.findById(1); 
			  System.out.println(id);
			  
			  System.out.println("Employee using update Details"); 
			  Employee emp1= new Employee(1,"sahin", "It"); 
			  rep.save(emp1);
			  
			  
			  rep.deleteById(2); 
			  System.out.println("delete");
			 
	}

}
