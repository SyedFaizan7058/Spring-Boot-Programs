package com.nit.service;

import com.nit.bindings.User;

public interface UserService {
	
	public boolean saveUser(User user);
	public boolean checkUser(String email,Integer password);

}
