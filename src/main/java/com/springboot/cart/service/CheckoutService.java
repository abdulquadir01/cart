package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Checkout;

import java.util.List;

public interface CheckoutService {

    List<Checkout> getAllCheckout();

    Checkout getCheckoutById(Integer id);

    Checkout createCheckout(Checkout checkout);

    Checkout updateCheckout(Integer id, Checkout checkout);

    void deleteCheckout(Integer id);

}
