package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nit.bindings.Enquiry;
import com.nit.bindings.repository.EnquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository repo;

	@Override
	public boolean saveEnquiry(Enquiry enquiry) {
		Integer id = repo.save(enquiry).getId();

		if (id != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Enquiry> viewAllEnquiry() {

		return repo.findAll();
	}

	@Override
	public List<Enquiry> filterEnquiry(Enquiry enquiry) {

//		Enquiry e = new Enquiry();
//		e.setClassMode(enquiry.getClassMode());
//		e.setCourse(enquiry.getCourse());
//		e.setStatus(enquiry.getStatus());

		Example<Enquiry> of = Example.of(enquiry);
		List<Enquiry> list = repo.findAll(of);
		System.out.println(list);
		return list;
	}

	@Override
	public Enquiry findById(Integer id) {
		return repo.findById(id).orElseThrow();
	}

}
