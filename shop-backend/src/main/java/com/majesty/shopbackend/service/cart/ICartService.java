package com.majesty.shopbackend.service.cart;

import java.math.BigDecimal;

import com.majesty.shopbackend.model.Cart;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);
}
