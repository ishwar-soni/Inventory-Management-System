package com.upgrad.ims.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrad.ims.entities.Product;
import com.upgrad.ims.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public List<Product> getAllProducts () {
		return productRepository.findAll();
	}
	
	@Transactional
	public Product save (Product product) {
		productRepository.save(product);
		return product;
	}
}
