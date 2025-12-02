package com.example.jenkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkindemoApplication {
	@GetMapping("/hello")
	public String hello() {
		return "Jenkins Project Working Successfully!";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkindemoApplication.class, args);
	}

}
