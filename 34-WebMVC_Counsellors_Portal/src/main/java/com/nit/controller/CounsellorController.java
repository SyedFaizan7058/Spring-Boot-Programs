package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.bindings.Counsellor;
import com.nit.bindings.Enquiry;
import com.nit.service.CounsellorService;
import com.nit.service.EnquiryService;

@Controller
public class CounsellorController {

	@Autowired
	private CounsellorService counsellorService;
	@Autowired
	private EnquiryService enquiryservice;

	// To load the login form
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("counsellorObj", new Counsellor());
		return "login";
	}

	// To handle loginForm
	@PostMapping("/login")
	public String handleLogin(Counsellor user, Model model) {

		Counsellor userObj = counsellorService.getCounsellor(user.getEmail(), user.getPassword());

		if (userObj == null) {
			model.addAttribute("emsg", "Invalid UserName and Password...!");
			return "login";

		} else {
			model.addAttribute("msg", userObj.getName() + ", Welcome to Your dashboard");
			return "dashboard";
		}
	}

	// To load the register form
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("counsellorObj", new Counsellor());
		return "register";
	}

	// To handle registerForm
	@PostMapping("/register")
	public String handleRegister(Counsellor counsellor, Model model) {

		boolean status = counsellorService.saveCounsellor(counsellor);
		model.addAttribute("counsellorObj", new Counsellor());

		if (status) {
			model.addAttribute("smsg", "User Registered");
		} else {
			model.addAttribute("emsg", "Registration Failed");
		}

		return "register";
	}

	@GetMapping("/addEnquiry")
	public String addEnquiry(Model model) {
		model.addAttribute("enquiryObj", new Enquiry());
		return "enquiryForm";
	}

	@PostMapping("/saveEnquiry")
	public String handleEnquiry(Enquiry enquiry, Model model) {

		boolean status = enquiryservice.saveEnquiry(enquiry);
		model.addAttribute("enquiryObj", new Enquiry());

		if (status) {
			model.addAttribute("smsg", "Enquiry Registered");
		} else {
			model.addAttribute("emsg", "Enquiry Registration Failed");
		}

		return "enquiryForm";
	}

	@GetMapping("/ViewEnquiries")
	public String viewEnquiry(Model model) {

		List<Enquiry> view = enquiryservice.viewAllEnquiry();
		model.addAttribute("enquiries", view);
		model.addAttribute("enquiryObj", new Enquiry());

		return "ViewEnquiries";
	}

//	@GetMapping("/updateEnquiry/{id}")
//	public String updateEnquiry(Model model, @PathVariable(name = "id") Integer id) {
//
//		Enquiry e = enquiryservice.findById(id);
//		if (e == null) {
//			List<Enquiry> view = enquiryservice.viewAllEnquiry();
//			model.addAttribute("enquiries", view);
//			model.addAttribute("enquiryObj", new Enquiry());
//			return "ViewEnquiries";
//		} else {
//			model.addAttribute("enquiryObj",e);
//			return "enquiryForm";
//		}
//	}

	@PostMapping("/filterEnquiry")
	public String viewFilterdEnquiry(Model model, Enquiry enquiry) {
		System.out.println(enquiry);
		List<Enquiry> list = enquiryservice.filterEnquiry(enquiry);
		model.addAttribute("enquiries", list);
		model.addAttribute("enquiryObj", new Enquiry());
		return "ViewEnquiries";
	}

	// For logout purpose
	@GetMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("counsellorObj", new Counsellor());
		return "login";
	}

}
