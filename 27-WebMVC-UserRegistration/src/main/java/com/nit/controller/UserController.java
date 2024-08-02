package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.bindings.User;
import com.nit.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login(Model model) {

		model.addAttribute("userObj", new User());
		return "register";
	}

	@PostMapping("/registerUser")
	public String handelLogin(Model model, User user) {
		if (userService.saveUser(user)) {
			model.addAttribute("smsg", "User added successfully...");
			model.addAttribute("userObj", new User());
		} else
			model.addAttribute("fmsg", "User failed to add...");

		return "login";
	}

	@PostMapping("/loginUser")
	public String loginUser(Model model, User user) {
		System.out.println(user);

		boolean checkUser = userService.checkUser(user.getEmail(), user.getPassword());
		if (checkUser) {
			model.addAttribute("msg", "User login successfully...");
			return "dashboard";
		} else {
			model.addAttribute("fmsg", "Incorrect email or password...");
			model.addAttribute("userObj", new User());
			return "login";
		}

	}

}
