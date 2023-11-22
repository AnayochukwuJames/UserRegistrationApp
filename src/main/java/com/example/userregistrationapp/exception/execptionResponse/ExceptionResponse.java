package com.example.userregistrationapp.exception;


import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ExceptionResponse {
    private int status;
    private String message;
    private String path;
    private String error;
    private Date TimeStamp;
}
