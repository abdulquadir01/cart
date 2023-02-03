package com.springboot.cart.service;

import com.springboot.cart.model.Cart;

import java.util.List;

public interface CheckoutService {

    List<Cart> getAllCheckout();

    CheckoutService getCheckoutById(Integer id);

    CheckoutService createCheckout(CheckoutService cartItem);

    CheckoutService updateCheckout(Integer id, CheckoutService cartItem);

    void deleteCheckout(Integer id);

}
