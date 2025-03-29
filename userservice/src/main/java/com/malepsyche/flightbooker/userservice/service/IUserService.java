package com.malepsyche.flightbooker.userservice.service;
import com.malepsyche.flightbooker.userservice.dto.UserDTO;

public interface IUserService {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
