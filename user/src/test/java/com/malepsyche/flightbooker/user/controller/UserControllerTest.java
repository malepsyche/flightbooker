package com.malepsyche.flightbooker.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.malepsyche.flightbooker.user.service.IUserService;
import com.malepsyche.flightbooker.user.dto.UserDTO;
import com.malepsyche.flightbooker.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private IUserService userService;

    @MockitoBean
    private UserMapper userMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testAddUser() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("John Doe");
        mockMvc.perform(post("/user/addUser")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(userDTO)))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetUserById() throws Exception {
        String userId = "11f00f0c-e6a5-12ec-9ec9-0242ac150002";
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("John Doe");
        when(userService.getUserById(userId)).thenReturn(userDTO);
        mockMvc.perform(get("/user/getUserById/" + userId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.userName").value("John Doe"));
    }
}
