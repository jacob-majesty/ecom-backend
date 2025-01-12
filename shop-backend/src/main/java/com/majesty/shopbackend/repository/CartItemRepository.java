package com.majesty.shopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
