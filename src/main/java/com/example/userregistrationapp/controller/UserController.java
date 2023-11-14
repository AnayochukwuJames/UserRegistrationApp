package com.example.userregistrationapp.controller;

import com.example.userregistrationapp.dto.UserDto;
import com.example.userregistrationapp.model.User;
import com.example.userregistrationapp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    public UserService userService;
    @PostMapping("create")
    public ResponseEntity<UserDto> createUser (@RequestBody UserDto userDto){
        UserDto createUser = userService.createUser(userDto);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }
    @GetMapping("/get-user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        UserDto userDto = userService.getUser(id);
        if (userDto != null) {
            return new ResponseEntity<>(userDto, HttpStatus.OK);
        }return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("update-user/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody UserDto updatedUserDto) {
        UserDto updatedUser = userService.updateUser(id, updatedUserDto);
        if (updatedUser != null) {
            return new ResponseEntity<>("User updated successfully.", HttpStatus.OK);
        }return new ResponseEntity<>("User not found. Update failed.", HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        String result = String.valueOf(userService.deleteUser(id));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
