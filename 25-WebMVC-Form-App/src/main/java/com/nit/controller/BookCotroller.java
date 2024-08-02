package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.bindings.Book;

@Controller
public class BookCotroller {

	@GetMapping("/book")
	public ModelAndView saveBook() {

		ModelAndView m = new ModelAndView();
		m.addObject("bookObj", new Book());
		m.setViewName("book");
		return m;
	}

	@PostMapping("/book")
	public ModelAndView bookDetails(Book book) {

		System.out.println(book);
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Book Saved...");
		m.setViewName("success");
		return m;
	}

}
