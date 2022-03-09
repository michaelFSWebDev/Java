package com.michaelmaines.firsttry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirsttryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirsttryApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Hello other world";
	}
}
