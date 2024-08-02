package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.bindings.Product;
import com.nit.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/addProduct")
	public ModelAndView saveProduct() {

		ModelAndView m = new ModelAndView();
		m.addObject("productObj", new Product());
		m.setViewName("index");
		return m;
	}

//	@PostMapping("/product")
//	public ModelAndView details(Product product) {
//		
//		ModelAndView m = new ModelAndView();
//		productService.saveProduct(product);
//		System.out.println(product);
//		m.addObject("msg","Product Saved Successfully...");
//		m.setViewName("success");
//		return m;
//	}

	@PostMapping("/product")
	public String details(Product product, RedirectAttributes redirectAttributes) {
		productService.saveProduct(product);
		redirectAttributes.addFlashAttribute("msg", "Product Saved Successfully...");
		return "redirect:/addProduct";
	}

	@GetMapping("/viewProducts")
	public ModelAndView viewProductDetails() {

		ModelAndView m = new ModelAndView();
		List<Product> list = productService.viewProducts();
		m.addObject("productList", list);
		m.setViewName("ViewAllProducts");
		return m;
	}

	@GetMapping("/deleteProduct/{id}")
	public ModelAndView deleteProduct(@PathVariable("id") Integer id) {

		ModelAndView m = new ModelAndView();
		if (productService.deleteProductById(id)) {
			List<Product> list = productService.viewProducts();
			m.addObject("productList", list);
			m.addObject("smsg", "Product Deleted Successfully");
		} else {
			m.addObject("fmsg", "Faild to delete product");
		}
		m.setViewName("ViewAllProducts");
		return m;
	}

	@GetMapping("/updateProduct/{id}")
	public ModelAndView updateProduct(@PathVariable("id") Integer id) {

		ModelAndView m = new ModelAndView();
		Product p = productService.findProduct(id);
		m.addObject("productObj",p);
		m.setViewName("index");
		return m;
	}

}