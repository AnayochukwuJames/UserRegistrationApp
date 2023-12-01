package com.example.userregistrationapp.service.serviceImp;

import com.example.userregistrationapp.dto.UpdateResponse;
import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.dto.UserResponse;
import com.example.userregistrationapp.mapper.UserMapper;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.repository.UserRepository;
import com.example.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(UserRequest request) {
        if (userRepository.existsByEmailOrPhoneNumber(request.getEmail(), request.getPhoneNumber())) {
            throw new RuntimeException("User has already registered before with the details");
        }
        User user = userRepository.save(UserMapper.mapUserRequestToUser(request));
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<UserResponse> getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("user not found"));
        return new ResponseEntity<>(UserMapper.mapUserResponse(user), HttpStatus.OK);
    }
    @Override
    public ResponseEntity<UserResponse> updateUser(Long id, UpdateResponse request){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        user = userRepository.save(UserMapper.mapUpdateResponseToUser(user, request));
        return new ResponseEntity<>(UserMapper.mapUserResponse(user), HttpStatus.OK);
    }
    @Override
    public ResponseEntity<String> deleteUser(Long id){
     userRepository.deleteById (id);
        return new ResponseEntity <> ("user deleted successfully", HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<UserResponse>> getAllUser(){
        List<UserResponse> user = userRepository.findAll().stream().map(UserMapper ::mapUserResponse)
                .collect(Collectors.toList());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
