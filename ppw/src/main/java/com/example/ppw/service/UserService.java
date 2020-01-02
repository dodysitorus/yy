package com.example.ppw.service;

import com.example.ppw.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    userRepo userRepo;

    public List findAll(){
        return  userRepo.findAll();
    }
}
