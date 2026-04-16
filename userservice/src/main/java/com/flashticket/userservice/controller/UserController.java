package com.flashticket.userservice.controller;

import com.flashticket.userservice.dto.user.UserRegistrationRequest;
import com.flashticket.userservice.dto.user.UserResponseDTO;
import com.flashticket.userservice.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Pavan Kumar
 * @created : 16/04/26, Thursday
 */

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping("/register")
    public UserResponseDTO register(@RequestBody UserRegistrationRequest requestDTO) {
        return userService.registerUser(requestDTO);
    }

    @GetMapping("/me")
    public UserResponseDTO getCurrentUser(Authentication authentication) {
        String email = authentication.getName();
        return userService.getUserByEmail(email);
    }
}
