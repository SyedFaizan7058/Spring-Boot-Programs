package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.bindings.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
