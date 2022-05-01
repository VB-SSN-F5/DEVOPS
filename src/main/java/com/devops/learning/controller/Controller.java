package com.devops.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@GetMapping("/home")
	public String index() {
		System.out.println("Hello");
		return "Greetings from Spring Boot!";
	}

}
