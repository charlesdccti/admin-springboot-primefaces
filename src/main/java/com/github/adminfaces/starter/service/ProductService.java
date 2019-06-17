package com.github.adminfaces.starter.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.adminfaces.starter.model.Product;
import com.github.adminfaces.starter.repository.ProductRepository;
import com.github.adminfaces.template.exception.BusinessException;

@Component
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAll(){
		
		return productRepository.findAll();
	}

	public void insert(Product product) {
		
		productRepository.save(product);
	}
	
	
	public Product findById(Integer id) {
		return findAll().stream()
				.filter(p -> p.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new BusinessException("Product not found with id " + id));
	}

	public void update(Product product) {
		productRepository.save(product);
	}

}
