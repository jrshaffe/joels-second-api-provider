package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		// TODO: Will this rebuild?
		return "Greetings from Spring Boot + Tanzu!";
	}

	@RequestMapping("/two")
	public String two() {
		return "New Controller";
	}

}