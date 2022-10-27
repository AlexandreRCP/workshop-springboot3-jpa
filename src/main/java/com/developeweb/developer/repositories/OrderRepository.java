package com.developeweb.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developeweb.developer.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
