package com.riad.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DemoController {

	@GetMapping("/")
	public String showHome() {
		return "Home";
	}
	
	
	@GetMapping("/leaders")
	public String showLeaders() {
		return "LeadersPage";
	}
	@GetMapping("/employees")
	public String showEmployes() {
		return "EmployeesPage";
	}
	
	
}
