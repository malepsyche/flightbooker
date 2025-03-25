package org.example.flightbooker.service.impl;
import org.example.flightbooker.dto.UserDTO;
import org.example.flightbooker.service.IUserService;
import org.example.flightbooker.mapper.UserMapper;
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
