package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service is down at the moment !!";
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "Contact Service is down at the moment !!";
	}
}
