package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("userObj", new User());
		return "index";
	}

	@PostMapping("/form")
	public String form(@Valid User user, BindingResult result, Model model) {
		
		model.addAttribute("userObj", new User());
		System.out.println(user);
		
		boolean hasErrors = result.hasErrors();
		System.out.println(hasErrors);
		
		if (hasErrors) {
//			model.addAttribute("emsg", "User not saved");
			return "index";
		} else {
			model.addAttribute("smsg", "User Saved");
			return "index";
		}
	}

}
