package com.michaelmaines.controllerpractice.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
		return "You searched for: " + searchQuery;
	}

}
