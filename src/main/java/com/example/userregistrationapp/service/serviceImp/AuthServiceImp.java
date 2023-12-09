package com.example.userregistrationapp.service.serviceImp;

import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.mapper.UserMapper;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.repository.UserRepository;
import com.example.userregistrationapp.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImp implements AuthService {
    private final UserRepository userRepository;
    @Override
    public ResponseEntity<String> signUp(UserRequest request){
        if (userRepository.existsByEmail(request.getEmail()));
        throw new RuntimeException("user with this email");
        User user = userRepository.save(UserMapper.mapUserRequestToUser(user), HttpStatus.CREATED);

    }

}
