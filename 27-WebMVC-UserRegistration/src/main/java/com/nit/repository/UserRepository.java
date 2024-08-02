package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.bindings.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmailAndPassword(String email,Integer password);
}
