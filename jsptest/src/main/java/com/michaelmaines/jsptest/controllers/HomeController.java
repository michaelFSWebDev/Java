package com.michaelmaines.jsptest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("name", "Michael");
		return "index.jsp";
	}

}
