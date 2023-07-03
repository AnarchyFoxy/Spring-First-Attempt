package com.ZeroDivisionError.FirstAttempt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAttemptApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAttemptApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Anarchy Foxy World!") String name) {
		return String.format("Hello %s!", name);
	}

}
