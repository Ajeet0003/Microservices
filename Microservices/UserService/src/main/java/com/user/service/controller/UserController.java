package com.user.service.controller;

import com.user.service.entiries.User;
import com.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1= userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId){
        User user1=userService.getUser(userId);
        return ResponseEntity.ok(user1);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllser(){
        List<User> user1=userService.getAllUser();
        return ResponseEntity.ok(user1);
    }
}
