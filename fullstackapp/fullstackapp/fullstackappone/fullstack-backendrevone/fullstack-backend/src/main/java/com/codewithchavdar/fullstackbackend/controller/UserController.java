package com.codewithchavdar.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithchavdar.fullstackbackend.model.User;
import com.codewithchavdar.fullstackbackend.userservice.UserService;

@CrossOrigin("http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userService.updateUser(newUser, id);
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
