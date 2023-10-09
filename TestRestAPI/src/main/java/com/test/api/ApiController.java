package com.test.api;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	@GetMapping("/api/test")
	public String test() {
		return "This api is created to refresh on REST API. The current time is: "
				+ new Date();
		//Test
	}
}
