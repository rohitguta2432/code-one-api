package com.api.codeoneapi.services;

import com.api.codeoneapi.model.Users;
import com.api.codeoneapi.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users create(Users user) {
        return userRepository.save(user);
    }
    
}
