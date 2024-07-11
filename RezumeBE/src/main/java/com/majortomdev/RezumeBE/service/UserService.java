package com.majortomdev.RezumeBE.service;
/* Created by JKinahan */
import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
