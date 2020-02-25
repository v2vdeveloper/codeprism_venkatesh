package com.codeprism;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/login")
	public String getMsg() {
		
		return "Username And Password";
	}
	
}
