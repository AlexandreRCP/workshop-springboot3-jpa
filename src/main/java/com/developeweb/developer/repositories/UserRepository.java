package com.developeweb.developer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developeweb.developer.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
