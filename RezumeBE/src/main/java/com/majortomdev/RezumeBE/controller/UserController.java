package com.majortomdev.RezumeBE.controller;


import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UserRepository;
import com.majortomdev.RezumeBE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/* Created by JKinahan */

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/usersignup")
    public User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @CrossOrigin
    @PostMapping("/userlogin")
    public User getUser(@RequestBody User loginUser){
        User user = userService.findByEmail(loginUser.getEmail());
        if(user!=null && user.getPassword().equals(loginUser.getPassword())){
            return user;
        }else {
            throw new RuntimeException("Somethings not right chief, are your logins right?");
        }
    }


//    @CrossOrigin
//    @PostMapping("/signup")
//    public ResponseEntity<User> signUpUser(@RequestBody User user) {
//        User savedUser = userRepository.save(user);
//        return ResponseEntity.status(201).body(savedUser);
//    }
//
//




//    @GetMapping("/users")
//    List<User> getAllUsers(String email) {
//        return userService.findByEmail(email);
//    }

}
