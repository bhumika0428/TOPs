package com.tops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
	@GetMapping("/")
	public String helloController()
	{
		return "hello spring!";
	}
}
