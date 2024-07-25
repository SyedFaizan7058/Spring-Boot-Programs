package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMVC {
	
	@GetMapping("/hello")
	public ModelAndView sayHello() {

		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Hello all of you....");
		m.setViewName("index");

		return m;
	}

}
