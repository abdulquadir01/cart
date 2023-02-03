package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrder();

    Order getOrderById(Integer id);

    Order createOrder(Order order);

    Order updateOrder(Integer id, Order order);

    void deleteOrder(Integer id);

}
