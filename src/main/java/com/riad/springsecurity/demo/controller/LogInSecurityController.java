package com.riad.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInSecurityController {

	@RequestMapping("/showMyLoginPage")
	public String ShowMyLoginForm() {
		
		return "LogIn/LoginBootPage";
	}
}
