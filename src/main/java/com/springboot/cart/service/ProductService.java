package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();

    Product getProductById(Integer id);

    Product createProduct(Product product);

    Product updateProduct(Integer id, Product product);

    void deleteProduct(Integer id);

}
