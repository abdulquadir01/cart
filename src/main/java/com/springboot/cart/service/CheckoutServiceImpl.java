package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public List<Cart> getAllCheckout() {
        return null;
    }

    @Override
    public CheckoutService getCheckoutById(Integer id) {
        return null;
    }

    @Override
    public CheckoutService createCheckout(CheckoutService cartItem) {
        return null;
    }

    @Override
    public CheckoutService updateCheckout(Integer id, CheckoutService cartItem) {
        return null;
    }

    @Override
    public void deleteCheckout(Integer id) {

    }
}
