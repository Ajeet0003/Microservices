package com.user.service.service.impl;

import com.user.service.entiries.User;
import com.user.service.exception.ResourceNotFoundException;
import com.user.service.repositories.UserRepository;
import com.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    /**
     * @param user 
     * @return
     */
    @Override
    public User saveUser(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepository.save(user);
    }

    /**
     * @return 
     */
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    /**
     * @param userId 
     * @return
     */
    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User vwith given id is not found on server !! : "+userId));
    }
}
