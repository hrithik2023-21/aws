package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECRController {

	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Hello welcome to ECR";
	}
}
