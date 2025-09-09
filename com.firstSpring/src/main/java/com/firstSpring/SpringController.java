package com.firstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	@GetMapping("/magic")
	public String magic() {
		return "Hello from controller";
	}
}
