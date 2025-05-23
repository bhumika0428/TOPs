package com.tops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tops.controller")
public class SimpleWebServiceApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SimpleWebServiceApplication.class, args);
		System.out.println("bye");
	}

}
