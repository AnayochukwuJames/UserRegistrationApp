package com.example.userregistrationapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    @NotBlank(message = "first name must not be blank" )
    @Size(min = 3, message = "first name must be minimum of 3 characters")
    private String firstName;
    @NotBlank(message = "last name must not be blank")
    @Size(min = 3, message = "last name must be minimum of 3 characters")
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
}
