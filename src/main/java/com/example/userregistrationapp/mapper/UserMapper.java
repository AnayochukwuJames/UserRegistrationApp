package com.example.userregistrationapp.mapper;

import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.model.User;

public class UserMapper {
    public static User mapUserRequestToUser(UserRequest request){
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .build();
    }

}
