package com.malepsyche.flightbooker.userservice.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.malepsyche.flightbooker.userservice.dto.UserDTO;


@Mapper
public interface UserMapper {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
