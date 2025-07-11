package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Model.Employee;
import repo.EmployeeRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repo")
@EntityScan(basePackages = "Model")
public class BasicCrudOperationswithSpringDataJpaApplication {

	public static void main(String[] args) {
		System.out.println("hello");
	ApplicationContext con= SpringApplication.run(BasicCrudOperationswithSpringDataJpaApplication.class, args);
		EmployeeRepo repo=con.getBean(EmployeeRepo.class);

		Employee e1=new Employee(1, "bhumika", "it");
		repo.save(e1);
	}

}
