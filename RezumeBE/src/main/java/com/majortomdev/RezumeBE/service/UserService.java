package com.majortomdev.RezumeBE.service;

import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
