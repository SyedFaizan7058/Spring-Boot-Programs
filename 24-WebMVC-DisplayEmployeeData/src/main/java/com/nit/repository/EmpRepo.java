package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
