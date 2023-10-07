package com.example.velocity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/getUserDetails")
	public String getDetails() {
		return "Welcome to Local Paradise";
	}
}
