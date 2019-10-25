package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

	@GetMapping(value = "/hello")
	public String helloworld(@RequestParam String param) {
		return new String("index");
	}

	
}
