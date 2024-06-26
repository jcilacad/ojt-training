package com.ilacad.controller;

import com.ilacad.entity.Cart;
import com.ilacad.entity.Product;
import com.ilacad.service.CartService;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    public List<Product> findAllProductsFromCart(String userEmail) {
        return cartService.findAllProductsFromCart(userEmail);
    }

    public void addToCart(String userEmail, Long productId, int numberOfItems) {
        cartService.addToCart(userEmail, productId, numberOfItems);
    }

    public void removeProductFromCart(String userEmail, Long productId, int numberOfItems) {
        cartService.removeProductFromCart(userEmail, productId, numberOfItems);
    }

    public void addCredits(String userEmail, BigDecimal credits) {
        cartService.updateCredits(userEmail, credits);
    }

    public void checkout(String userEmail, BigDecimal[] credits) {
        cartService.checkout(userEmail, credits);
    }
}
