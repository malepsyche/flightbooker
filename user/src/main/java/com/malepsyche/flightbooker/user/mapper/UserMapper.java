package com.malepsyche.flightbooker.user.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.malepsyche.flightbooker.user.dto.UserDTO;


@Mapper
public interface UserMapper {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
