package com.developeweb.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developeweb.developer.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
