package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bindings.Product;
import com.nit.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public void saveProduct(Product product) {

		productRepo.save(product);
	}

	public List<Product> viewProducts() {
		return productRepo.findAll();
	}

	public boolean deleteProductById(Integer id) {

		if (id != null) {
			productRepo.deleteById(id);
			return true;
		} else
			return false;

	}

	public Product findProduct(Integer id) {
		return productRepo.findById(id).orElseThrow();
	}

}
