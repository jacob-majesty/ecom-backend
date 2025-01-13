package com.majesty.shopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
