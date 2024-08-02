package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	// Sending response to client using model object
	// Taking user name from path using @PathVariable annotation
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable(name = "name") String name, Model model) {

		model.addAttribute("msg", name+" Good Morning...");
		return "index";
	}

	// Sending direct response to client using @ResponceBody annotation
	// Taking name from query parameter using @RequestParam annotation
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome(@RequestParam("name") String name) {
		String str = null;
//		str.length();
		return name+" Welcome to Hyd...";
	}

	// This method can handle NullPointerException
	@ExceptionHandler(NullPointerException.class)
	@ResponseBody
	public String exception() {
		return "NullPointerException...";
	}

}
