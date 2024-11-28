package com.victordzns.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victordzns.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
