package com.springboot.cart.service.impl;

import com.springboot.cart.model.Product;
import com.springboot.cart.repository.ProductRepository;
import com.springboot.cart.service.ProductService;
import com.springboot.cart.utils.AppUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        Product existingProduct = productRepository.findById(id).get();

        Product newProduct = new Product();
        if(AppUtils.anyEmpty(newProduct)){
            newProduct = productRepository.save(existingProduct);
            newProduct.setProductId(id);
        }

        return newProduct;
    }

    @Override
    public void deleteProduct(Integer id) {
        Product product = new Product();

        try{
            product = productRepository.findById(id).get();

            productRepository.delete(product);
        }catch (Exception ex){
            ex.getMessage();
        }



    }
}
