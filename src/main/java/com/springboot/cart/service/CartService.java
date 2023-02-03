package com.springboot.cart.service;

import com.springboot.cart.model.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllCart();

    CartService getCartById(Integer id);

    CartService createCart(CartService cartItem);

    CartService updateCart(Integer id, CartService cartItem);

    void deleteCart(Integer id);

}
