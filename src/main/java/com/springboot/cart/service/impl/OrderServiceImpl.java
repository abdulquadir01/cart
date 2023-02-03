package com.springboot.cart.service.impl;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Order;
import com.springboot.cart.repository.OrderRepository;
import com.springboot.cart.service.OrderService;
import com.springboot.cart.utils.AppUtils;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Integer id, Order order) {
        Order existingOrder = orderRepository.findById(id).get();

        Order newOrder = new Order();
        if(AppUtils.anyEmpty(newOrder)){
            newOrder = orderRepository.save(existingOrder);
            newOrder.setOrderId(id);
        }

        return newOrder;
    }

    @Override
    public void deleteOrder(Integer id) {
        Order order = new Order();
        try {
            order = orderRepository.findById(id).get();

            orderRepository.delete(order);

        }catch (Exception ex){
            ex.getMessage();
        }

    }
}
