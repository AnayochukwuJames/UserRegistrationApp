package com.example.userregistrationapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
