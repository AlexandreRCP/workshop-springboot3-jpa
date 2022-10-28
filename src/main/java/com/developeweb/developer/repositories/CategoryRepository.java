package com.developeweb.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developeweb.developer.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
