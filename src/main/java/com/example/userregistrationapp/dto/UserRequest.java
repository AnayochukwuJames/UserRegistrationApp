package com.example.userregistrationapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    @NotBlank(message = "first name must not be null")
    @Size(min = 3, message = "first name must not be minimum of 3 characters")
    private String firstName;
    @NotBlank(message = "last name must not be empty")
    @Size(min = 3, message = "lastname must not be minimum of 3 characters")
    private String lastName;
    @NotBlank(message = "email must be valid")
    private String email;
    @NotBlank(message = "phone number must be correct")
    private String phoneNumber;
    @NotBlank(message = "password must be strong")
    private String password;


}
