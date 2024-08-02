package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

	@GetMapping("/sayHello")
	public String sayHello(Model model) {
//		int x = 10 / 0;
		model.addAttribute("msg", "Hi, Hello");
		return "index";
	}

	@GetMapping("/welcome")
	public String welcome(Model model) {

		String str = null;
		str.length();
		return "index";
	}

}
