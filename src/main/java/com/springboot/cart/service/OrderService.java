package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllCheckout();

    OrderService getCheckoutById(Integer id);

    OrderService createCheckout(OrderService cartItem);

    OrderService updateCheckout(Integer id, OrderService cartItem);

    void deleteCheckout(Integer id);

}
