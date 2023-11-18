package com.example.userregistrationapp.service;


import com.example.userregistrationapp.dto.UpdateResponse;
import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.dto.UserResponse;
import com.example.userregistrationapp.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<User> createUser(UserRequest request);

    ResponseEntity<UserResponse> getUserById(Long id);

    ResponseEntity<UserResponse> updateUser(Long id, UpdateResponse request);
}
