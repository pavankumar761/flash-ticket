package com.flashticket.userservice.controller;

import com.flashticket.userservice.dto.login.LoginRequestDTO;
import com.flashticket.userservice.dto.login.LoginResponseDTO;
import com.flashticket.userservice.service.IAuthService;
import com.flashticket.userservice.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Pavan Kumar
 * @created : 15/04/26, Wednesday
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/auth")
public class AuthController {

    private final IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
