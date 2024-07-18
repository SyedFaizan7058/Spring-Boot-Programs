package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
