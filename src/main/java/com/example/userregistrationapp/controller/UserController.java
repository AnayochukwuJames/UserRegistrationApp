package com.example.userregistrationapp.controller;

import com.example.userregistrationapp.dto.UpdateResponse;
import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.dto.UserResponse;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {
    private final UserService userService;
    @PostMapping("create")
    public ResponseEntity<User> createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
@GetMapping("get-user")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
}
@PutMapping("user-update")
public ResponseEntity<UserResponse> updateUser(@PathVariable Long id, @RequestBody UpdateResponse updateResponse){
        return userService.updateUser(id, updateResponse);
}
}