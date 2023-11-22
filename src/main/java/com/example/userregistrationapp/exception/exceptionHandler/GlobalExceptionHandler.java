package com.example.userregistrationapp.exception.exceptionHandler;
import com.example.userregistrationapp.exception.execptionResponse.ExceptionResponse;
import com.example.userregistrationapp.exception.execptionResponse.UserAlreadyExistException;
import com.example.userregistrationapp.exception.execptionResponse.UserNotFoundException;
import com.example.userregistrationapp.mapper.ExceptionMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionResponse> userNotFoundException(UserNotFoundException e, HttpServletRequest request){
        ExceptionResponse exceptionResponse = ExceptionMapper.mapToExceptionResponse(e, request, HttpStatus.NOT_FOUND);
        return new  ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserAlreadyExistException.class)

    public ResponseEntity<ExceptionResponse> userAlreadyExistException(UserAlreadyExistException e, HttpServletRequest request){
        ExceptionResponse exceptionHandler = ExceptionMapper.mapToExceptionResponse(e, request, HttpStatus.CONFLICT);
        return new  ResponseEntity<>(exceptionHandler, HttpStatus.CONFLICT);

    }

}
