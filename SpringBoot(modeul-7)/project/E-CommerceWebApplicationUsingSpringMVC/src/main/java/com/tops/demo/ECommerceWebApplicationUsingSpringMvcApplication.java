package com.tops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tops.repository")
@EntityScan(basePackages = "com.tops.model")
@ComponentScan(basePackages = "com.tops.servies")
@ComponentScan(basePackages = "com.tops.controller")
public class ECommerceWebApplicationUsingSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWebApplicationUsingSpringMvcApplication.class, args);
	}

}
