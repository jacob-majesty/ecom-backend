package com.majesty.shopbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
