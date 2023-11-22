package com.example.userregistrationapp.mapper;

import com.example.userregistrationapp.exception.execptionResponse.ExceptionResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class ExceptionMapper {

    public static ExceptionResponse mapToExceptionResponse (Exception e, HttpServletRequest request, HttpStatus status){
        return ExceptionResponse.builder()
                .status(status.value())
                .message(e.getMessage())
                .path(request.getRequestURI())
                .error(status.name())
                .TimeStamp(LocalDateTime.now())
                .build();
    }
}
