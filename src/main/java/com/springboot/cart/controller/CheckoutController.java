package com.springboot.cart.controller;


import com.springboot.cart.service.CartService;
import com.springboot.cart.service.CheckoutService;
import com.springboot.cart.service.impl.CheckoutServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
}
