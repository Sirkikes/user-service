package com.ms.tutorial.userservice.service;

import com.ms.tutorial.userservice.entity.User;
import com.ms.tutorial.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user){
        User userNew = userRepository.save(user);
        return userNew;
    }

}
