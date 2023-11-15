package com.example.userregistrationapp.serviceImp;

import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.mapper.UserMapper;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.repository.UserRepository;
import com.example.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(UserRequest request) {
       if (userRepository.existsByEmailOrPhoneNumber(request.getEmail(),request.getPhoneNumber())){
           throw new RuntimeException("User has already registered before with the details");
       }
       User user = userRepository.save(UserMapper.mapUserRequestToUser(request));
     return new ResponseEntity<>(user,HttpStatus.CREATED);

    }
}
