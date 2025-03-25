package org.example.flightbooker.service;
import org.example.flightbooker.dto.UserDTO;

public interface IUserService {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
