package com.example.userregistrationapp.exception.execptionResponse;

public class UserAlreadyExistException extends RuntimeException{

    public UserAlreadyExistException(String message){
        super(message);
    }
}
