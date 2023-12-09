package com.example.userregistrationapp.service;

import com.example.userregistrationapp.dto.UserRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<String> signUp(UserRequest request);

//    ResponseEntity<String> sigUp(String s);
}
