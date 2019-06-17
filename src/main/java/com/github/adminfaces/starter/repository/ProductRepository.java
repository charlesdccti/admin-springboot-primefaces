package com.github.adminfaces.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.adminfaces.starter.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
