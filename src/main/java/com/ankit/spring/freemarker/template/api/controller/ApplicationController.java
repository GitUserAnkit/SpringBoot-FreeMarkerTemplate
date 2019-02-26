package com.ankit.spring.freemarker.template.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ApplicationController {

	@GetMapping("/getUser/{input}")
	public String gretting(@PathVariable String input, Model model) {
		String welcomemsg = "hi " + input + " welcome to Spring world";
		model.addAttribute("message", welcomemsg);
		return "welcome";
	}
}
