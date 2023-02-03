package com.springboot.cart.service;

import com.springboot.cart.model.User;
import com.springboot.cart.repository.UserRepository;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User user) {

        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        User user = new User();
        try {
            try {
                user = userRepository.findById(id).get();
            } catch (Exception ex) {
                System.out.println("Exception occurred");
                ex.getMessage();
                ex.printStackTrace();
            }
            userRepository.delete(user);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
