package com.demo.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "Test 1 Passed - testing !";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "Test2 - for webhook - test";
	}
	@GetMapping("/test3")
	public String test2() {
		return "Test3 - 29 Apr";
	}

}
