package com.dpproductions.dpproductions.controller;

import com.dpproductions.dpproductions.beans.User;
import com.dpproductions.dpproductions.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/list")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
