package com.malepsyche.flightbooker.user.service;
import com.malepsyche.flightbooker.user.dto.UserDTO;

import java.util.concurrent.CompletableFuture;

public interface IUserService {
    public CompletableFuture<Void> addUser(UserDTO userDTO);
    public CompletableFuture<UserDTO> getUserById(String userId);
}
