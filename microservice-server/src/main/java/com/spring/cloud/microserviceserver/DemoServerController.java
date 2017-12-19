package com.spring.cloud.microserviceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServerController {

	@GetMapping("/rest/server")
	public String getInfo() {
		return "Welcome to Microservice.....!!!!!!";
	}
}
