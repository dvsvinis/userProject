package com.dvs.bird.services;

import com.dvs.bird.models.User;
import com.dvs.bird.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



}
