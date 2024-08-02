package com.nit.bindings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nit.bindings.Counsellor;

public interface CounsellorRepository extends JpaRepository<Counsellor, Integer> {

	public Counsellor findByEmailAndPassword(String email, String pwd);

}
