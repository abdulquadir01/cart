package com.springboot.cart.service;

import com.springboot.cart.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> getAllCheckout() {
        return null;
    }

    @Override
    public OrderService getCheckoutById(Integer id) {
        return null;
    }

    @Override
    public OrderService createCheckout(OrderService cartItem) {
        return null;
    }

    @Override
    public OrderService updateCheckout(Integer id, OrderService cartItem) {
        return null;
    }

    @Override
    public void deleteCheckout(Integer id) {

    }
}
