package com.user.service.service;

import com.user.service.entiries.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}
