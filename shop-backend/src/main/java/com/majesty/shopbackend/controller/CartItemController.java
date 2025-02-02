package com.majesty.shopbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.majesty.shopbackend.exceptions.ResourceNotFoundException;
import com.majesty.shopbackend.response.ApiResponse;
import com.majesty.shopbackend.service.cart.ICartItemService;
import com.majesty.shopbackend.service.cart.ICartService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Tag(name = "Cart Item Controller", description = "Cart Item Controller")
@RequestMapping("${api.prefix}/cartItems")
public class CartItemController {
    private final ICartItemService cartItemService;
    private final ICartService cartService;

    @PostMapping("/item/add")
    @Operation(summary = "Add Item To Cart", description = "Add item to cart")
    public ResponseEntity<ApiResponse> addItemToCart(@RequestParam(required = false) Long cartId,
            @RequestParam Long productId,
            @RequestParam Integer quantity) {
        try {
            if (cartId == null) {
                cartId = cartService.initializeNewCart();
            }
            cartItemService.addItemToCart(cartId, productId, quantity);
            return ResponseEntity.ok(new ApiResponse("Add Item Success", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @DeleteMapping("/cart/{cartId}/item/{itemId}/remove")
    @Operation(summary = "Remove Item From Cart", description = "Remove item from cart")
    public ResponseEntity<ApiResponse> removeItemFromCart(@PathVariable Long cartId, @PathVariable Long itemId) {
        try {
            cartItemService.removeItemFromCart(cartId, itemId);
            return ResponseEntity.ok(new ApiResponse("Remove Item Success", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @PutMapping("/cart/{cartId}/item/{itemId}/update")
    @Operation(summary = "Update Item Quantity", description = "Update item quantity")
    public ResponseEntity<ApiResponse> updateItemQuantity(@PathVariable Long cartId,
            @PathVariable Long itemId,
            @RequestParam Integer quantity) {
        try {
            cartItemService.updateItemQuantity(cartId, itemId, quantity);
            return ResponseEntity.ok(new ApiResponse("Update Item Success", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }

    }
}
