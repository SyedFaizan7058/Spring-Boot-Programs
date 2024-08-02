package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.exception.ProductNotFoundException;

@Controller
public class ProductController {

	@GetMapping("/product/{id}")
	public String getProduct(Model model, Integer id) throws ProductNotFoundException {
		if (id >=100) {
			throw new ProductNotFoundException("Product not available..!!");
		} else
			model.addAttribute("msg", "Apple Phone");

		return "index";
	}

}
