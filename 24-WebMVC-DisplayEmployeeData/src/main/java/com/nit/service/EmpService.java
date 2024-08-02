package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Emp;
import com.nit.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo empRepo;

	public List<Emp> getEmployees() {

		return empRepo.findAll();
	}

}
