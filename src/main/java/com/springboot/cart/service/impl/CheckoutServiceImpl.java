package com.springboot.cart.service.impl;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.Checkout;
import com.springboot.cart.repository.CheckoutRepository;
import com.springboot.cart.service.CheckoutService;
import com.springboot.cart.utils.AppUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    public List<Checkout> getAllCheckout() {
        return checkoutRepository.findAll();
    }

    @Override
    public Checkout getCheckoutById(Integer id) {
        return checkoutRepository.findById(id).get();
    }

    @Override
    public Checkout createCheckout(Checkout checkout) {
        return checkoutRepository.save(checkout);
    }

    @Override
    public Checkout updateCheckout(Integer id, Checkout checkout) {
        Checkout existingCheckout = checkoutRepository.findById(id).get();

        Checkout newCheckout = new Checkout();
        if(AppUtils.anyEmpty(newCheckout)){
            newCheckout = checkoutRepository.save(existingCheckout);
            newCheckout.setCheckoutId(id);
        }

        return newCheckout;
    }

    @Override
    public void deleteCheckout(Integer id) {
        Checkout checkout = new Checkout();
        try{
            checkout = checkoutRepository.findById(id).get();

            checkoutRepository.delete(checkout);

        }catch (Exception ex){
            ex.getMessage();
        }

    }
}
