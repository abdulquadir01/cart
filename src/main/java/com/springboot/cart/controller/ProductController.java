package com.springboot.cart.controller;


import com.springboot.cart.model.Product;
import com.springboot.cart.model.User;
import com.springboot.cart.repository.ProductRepository;
import com.springboot.cart.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
