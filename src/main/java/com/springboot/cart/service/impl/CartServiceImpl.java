package com.springboot.cart.service.impl;

import com.springboot.cart.model.Cart;
import com.springboot.cart.repository.CartRepository;
import com.springboot.cart.service.CartService;
import com.springboot.cart.utils.AppUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Cart> getAllCart() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCartById(Integer id) {
        return cartRepository.findById(id).get();
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Integer id, Cart cart) {
        Cart existingCart = cartRepository.findById(id).get();

        Cart newCart = new Cart();
        if(AppUtils.anyEmpty(cart)){
            newCart = cartRepository.save(cart);
            newCart.setCartId(id);
        }

        return newCart;
    }

    @Override
    public void deleteCart(Integer id) {

    }
}
