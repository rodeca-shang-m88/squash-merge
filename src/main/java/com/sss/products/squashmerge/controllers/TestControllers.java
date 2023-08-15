package com.sss.products.squashmerge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControllers {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name") String name) {
		return "Hello " + name;
	}

}
