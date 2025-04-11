package com.malepsyche.flightbooker.user.service.impl;
import com.malepsyche.flightbooker.user.dto.UserDTO;
import com.malepsyche.flightbooker.user.mapper.UserMapper;
import com.malepsyche.flightbooker.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl implements IUserService {
    public UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Async
    public CompletableFuture<Void> addUser(UserDTO userDTO) {
        userMapper.addUser(userDTO);
        return CompletableFuture.completedFuture(null);
    }

    @Override
    @Async
    public CompletableFuture<UserDTO> getUserById(String userId) {
        UserDTO userDTO = userMapper.getUserById(userId);
        return CompletableFuture.completedFuture(userDTO);
    }
}
