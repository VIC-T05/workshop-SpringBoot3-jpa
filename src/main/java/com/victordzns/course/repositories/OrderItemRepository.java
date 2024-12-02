package com.victordzns.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victordzns.course.entities.OrderItem;
import com.victordzns.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
