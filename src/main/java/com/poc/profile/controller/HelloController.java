package com.poc.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

	@Value("${spring.message}")
	private String message;
	
	@GetMapping(path="/greet")
	public String getMessage() {
		return message;
	}
}
