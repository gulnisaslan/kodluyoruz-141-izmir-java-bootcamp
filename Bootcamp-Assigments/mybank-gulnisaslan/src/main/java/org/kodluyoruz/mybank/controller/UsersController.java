package org.kodluyoruz.mybank.controller;

import org.kodluyoruz.mybank.controller.responseDtoMapping.ResponseDtoMappingForController;
import org.kodluyoruz.mybank.dtos.UserCreateDto;
import org.kodluyoruz.mybank.dtos.UserResponseDto;
import org.kodluyoruz.mybank.dtos.UserUpdateDto;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name="api/v1")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getallusers")
    public UserResponseDto getAllUsers(){
        User allUsers = this.userService.getAllUsers();
        return ResponseDtoMappingForController.createUserForResponseDto(allUsers);
    }

    @PostMapping(value = "/createUser")
    public UserResponseDto createUser(@RequestBody UserCreateDto userCreateDto){
        User user = this.userService.createUser(userCreateDto.toUser());
        return ResponseDtoMappingForController.createUserForResponseDto(user);
    }

    @PutMapping("/update")
    public UserResponseDto updateUser(@RequestBody UserUpdateDto userUpdateDto){
       User user = this.userService.updateUser(userUpdateDto.toUserUpdate());
       return ResponseDtoMappingForController.createUserForResponseDto(user);
    }

}
