package com.developeweb.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developeweb.developer.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
