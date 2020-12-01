package com.demoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoweb.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
