package com.malepsyche.flightbooker.userservice.service.impl;
import com.malepsyche.flightbooker.userservice.dto.UserDTO;
import com.malepsyche.flightbooker.userservice.mapper.UserMapper;
import com.malepsyche.flightbooker.userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    public UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        userMapper.addUser(userDTO);
    }

    @Override
    public UserDTO getUserById(int userId) {
        return userMapper.getUserById(userId);
    }
}
