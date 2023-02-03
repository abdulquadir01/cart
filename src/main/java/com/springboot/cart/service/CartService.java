package com.springboot.cart.service;

import com.springboot.cart.model.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllCart();

    Cart getCartById(Integer id);

    Cart createCart(Cart cart);

    Cart updateCart(Integer id,Cart cart);

    void deleteCart(Integer id);

}
