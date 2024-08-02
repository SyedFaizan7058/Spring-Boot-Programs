package com.nit.service;

import com.nit.bindings.Counsellor;

public interface CounsellorService {
	
	public boolean saveCounsellor(Counsellor counsellor);

	public Counsellor getCounsellor(String email, String password);

}
