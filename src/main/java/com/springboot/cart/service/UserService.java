package com.springboot.cart.service;

import com.springboot.cart.model.Cart;
import com.springboot.cart.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserById(Integer id);

    User createUser(User User);

    User updateUser(Integer id, User user);

    void deleteUser(Integer id);

}
