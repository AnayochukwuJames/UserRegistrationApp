package com.example.userregistrationapp.exception.execptionResponse;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
