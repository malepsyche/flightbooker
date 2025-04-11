package com.malepsyche.flightbooker.user.controller;

import com.malepsyche.flightbooker.user.dto.UserDTO;
import com.malepsyche.flightbooker.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/user")
public class UserController {
    public IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("addUser")
    public CompletableFuture<Void> addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    @GetMapping("getUserById/{userId}")
    public CompletableFuture<UserDTO> getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }
}
