package com.upgrad.ims.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upgrad.ims.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
