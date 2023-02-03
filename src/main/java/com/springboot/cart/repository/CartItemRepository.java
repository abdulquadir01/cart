package com.springboot.cart.repository;

import com.springboot.cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<Cart, Integer> {

}
