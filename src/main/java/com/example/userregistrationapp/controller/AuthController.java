package com.example.userregistrationapp.controller;

import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/Auth**")
public class AuthController {
    private final UserService userService;
//@PostMapping("signUp")
//    public ResponseEntity<String> signUp(UserRequest request) {
//        return userService.sigUp("your successfully registered kindly check your email to complete your registration");
//    }
}