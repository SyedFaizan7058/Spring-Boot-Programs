package com.nit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerrrr {

	@ExceptionHandler(ArithmeticException.class)
	public String handelException() {

		return "exception";
	}
	@ExceptionHandler(ProductNotFoundException.class)
	public String handelException3() {
		
		return "exception";
	}

//	@ExceptionHandler(NullPointerException.class)
//	public String handelException2() {
//
//		return "exception";
//	}

}
