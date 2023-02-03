package com.springboot.cart.service;

import com.springboot.cart.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Integer id) {

    }
}
