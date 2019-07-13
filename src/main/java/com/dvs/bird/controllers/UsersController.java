package com.dvs.bird.controllers;

import com.dvs.bird.models.User;
import com.dvs.bird.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("/api/v1/users")
public class UsersController {

    private UserRepository userRepository;

    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List findAll() {
        return userRepository.findAll();
    }

    @PutMapping("api/v1/users")
    @ResponseStatus(HttpStatus.OK)
    public User create(@RequestBody User user){
       return userRepository.save(user);
    }




    @GetMapping("api/v1/users/{id}")
    public User get(@PathVariable("id") Long id){
        return userRepository.getUserById(id);
    }



}

