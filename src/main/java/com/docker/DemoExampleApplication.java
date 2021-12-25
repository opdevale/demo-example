package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Application
 * @author Onkar Prakash Devale
 *
 */
@SpringBootApplication
@RestController
@RequestMapping(path = "/demo")
public class DemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExampleApplication.class, args);
	}

	
	@GetMapping
	public String getInfo() {
		return "This is DEMO APPLICATION !";
	}
}
