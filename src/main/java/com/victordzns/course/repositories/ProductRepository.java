package com.victordzns.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victordzns.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
