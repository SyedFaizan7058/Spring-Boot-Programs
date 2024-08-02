package com.nit.service;

import java.util.List;

import com.nit.bindings.Enquiry;

public interface EnquiryService {

	public boolean saveEnquiry(Enquiry enquiry);
	public List<Enquiry> viewAllEnquiry();
	public List<Enquiry> filterEnquiry(Enquiry enquiry);
	public Enquiry findById(Integer id);

}
