package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.entity.Emp;
import com.nit.service.EmpService;

@Controller
public class ControllerMVC {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/getEmployees")
	public ModelAndView getEmps() {
		
		ModelAndView m = new ModelAndView();
		List<Emp> list = service.getEmployees();
		m.addObject("list",list);
		m.setViewName("index");
		
		return m;
	}

}
