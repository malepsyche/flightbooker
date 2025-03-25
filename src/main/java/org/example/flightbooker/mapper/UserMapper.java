package org.example.flightbooker.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.flightbooker.dto.UserDTO;


@Mapper
public interface UserMapper {
    public void addUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
}
