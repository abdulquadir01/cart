package com.springboot.cart.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "checkoutItems")
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer checkoutId;

    @ManyToOne
    @JoinColumn(name = "cart_item")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "user_product")
    private User user;

    @OneToOne
    private Order order;

    private Boolean paymentStatus;

}
