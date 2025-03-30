package com.malepsyche.flightbooker.user.service;
import com.malepsyche.flightbooker.user.dto.UserDTO;

public interface IUserService {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
