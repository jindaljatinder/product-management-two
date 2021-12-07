package com.gamechangers.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamechangers.product.dao.ProductRepository;
import com.gamechangers.product.domain.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Optional<Product> findById(long id) {
		return productRepository.findById(id);
	}

	public Product createOrUpdate(Product product) {
		return productRepository.save(product);
	}

	public void deleteById(long id) {
		productRepository.deleteById(id);
	}
	
	public int add(int a,int b) {
		return a+b;
	}
}