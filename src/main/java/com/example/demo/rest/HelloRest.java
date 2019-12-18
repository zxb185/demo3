package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

	@GetMapping(value = "/index")
	public String helloworld() {
		return new String("index");
	}

	
}
