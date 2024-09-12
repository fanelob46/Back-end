package com.crud.back_end.controller;

import com.crud.back_end.model.User;
import com.crud.back_end.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    ///post data to the database
    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    ///getting all users from the database
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
