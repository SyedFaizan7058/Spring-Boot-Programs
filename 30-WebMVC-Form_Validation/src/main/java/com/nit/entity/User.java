package com.nit.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class User {

	@NotEmpty(message = "field is mandetory")
	private String name;
	@Email
	@NotEmpty
	private String email;

	@NotNull
	private Long phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

}
