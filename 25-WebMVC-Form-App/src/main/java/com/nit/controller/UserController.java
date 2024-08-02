package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.bindings.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView saveUser() {

		ModelAndView m = new ModelAndView();
		m.addObject("userObj", new User());
		m.setViewName("index");
		return m;
	}

	@PostMapping("/user")
	public ModelAndView details(User user) {

		System.out.println(user);
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "User Saved...");
		m.setViewName("success");
		return m;
	}

}
