package com.example.userregistrationapp.serviceImp;

import com.example.userregistrationapp.dto.UserDto;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.repository.UserRepository;
import com.example.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUser(Long id) {

        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto updatedUserDto) {
        return null;
    }

    @Override
    public User deleteUser(Long id) {
        return null;
    }
}
