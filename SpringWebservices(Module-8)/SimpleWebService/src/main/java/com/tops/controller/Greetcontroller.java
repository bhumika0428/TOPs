package com.tops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetcontroller {
 @GetMapping("/")
	public String greeting()
	{
		return "hello spring";
	}
}
