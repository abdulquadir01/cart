package com.springboot.cart.repository;

import com.springboot.cart.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {

}
