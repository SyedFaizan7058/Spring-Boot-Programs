package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bindings.User;
import com.nit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean saveUser(User user) {

		if (user != null) {
			userRepository.save(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean checkUser(String email, Integer password) {

		User user = userRepository.findByEmailAndPassword(email, password);
		System.out.println(user);
		if (user != null)
			return true;
		return false;
	}

}
