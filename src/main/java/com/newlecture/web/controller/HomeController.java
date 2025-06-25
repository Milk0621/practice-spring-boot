package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/index")
	public String index() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/aabb")
	public String aaa() {
		return "aaaa";
	}
	
}
