package com.majortomdev.RezumeBE.controller;


import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UserRepository;
import com.majortomdev.RezumeBE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/* Created by JKinahan */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @CrossOrigin
    @PostMapping("/userlogin")
    public User getUser(@RequestBody User loginUser){
        User user = userService.findByEmail(loginUser.getEmail());
        if(user!=null && user.getPassword().equals(loginUser.getPassword())){
            return user;
        }else {
            throw new RuntimeException("Somethings not right chief");
        }
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userService.findByEmail());
    }

}
