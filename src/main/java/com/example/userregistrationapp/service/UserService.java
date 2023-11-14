package com.example.userregistrationapp.service;

import com.example.userregistrationapp.dto.UserDto;
import com.example.userregistrationapp.model.User;

public interface UserService {
       UserDto createUser(UserDto userDto);
       UserDto getUser(Long id);
       UserDto updateUser (Long id, UserDto updatedUserDto);
      User deleteUser (Long id);
}
