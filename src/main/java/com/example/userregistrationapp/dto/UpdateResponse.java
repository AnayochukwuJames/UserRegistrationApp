package com.example.userregistrationapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

public class UpdateResponse {

    @NotBlank(message = "first name must not be null")

    @Size(min = 3, message = "first name must not be minimum of 3 characters")

    private String firstName;
    @NotBlank(message = "last name must not be blank")

    @Size(min = 3, message = "last name must be minimum of 3 characters")

    private String lastName;
    @NotBlank(message = "phoneNumber must not be empty")

    private String phoneNumber;
}
