package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bindings.Counsellor;
import com.nit.bindings.repository.CounsellorRepository;

@Service
public class CounsellorServiceImpl implements CounsellorService {

	@Autowired
	private CounsellorRepository repo;

	// To add Counselor in the database
	@Override
	public boolean saveCounsellor(Counsellor counsellor) {
		Counsellor save = repo.save(counsellor);
		if (save.getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public Counsellor getCounsellor(String email, String password) {
		
		Counsellor con = repo.findByEmailAndPassword(email, password);
		
		return con;
	}

}
