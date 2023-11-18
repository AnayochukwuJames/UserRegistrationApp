package com.example.userregistrationapp.mapper;

import com.example.userregistrationapp.dto.UpdateResponse;
import com.example.userregistrationapp.dto.UserRequest;
import com.example.userregistrationapp.dto.UserResponse;
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
public static UserResponse mapUserResponse(User response){
        return UserResponse.builder()
                .id(response.getId())
                .firstName(response.getFirstName())
                .lastName(response.getLastName())
                .phoneNumber(response.getPhoneNumber())
                .email(response.getEmail())
                .build();
}
public static User mapUpdateResponseToUser(User user, UpdateResponse request){
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPhoneNumber(request.getPhoneNumber());
        return user;
}
}
