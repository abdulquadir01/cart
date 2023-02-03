package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {
    @Override
    public List<Cart> getAllCart() {
        return null;
    }

    @Override
    public CartService getCartById(Integer id) {
        return null;
    }

    @Override
    public CartService createCart(CartService cartItem) {
        return null;
    }

    @Override
    public CartService updateCart(Integer id, CartService cartItem) {
        return null;
    }

    @Override
    public void deleteCart(Integer id) {

    }
}
