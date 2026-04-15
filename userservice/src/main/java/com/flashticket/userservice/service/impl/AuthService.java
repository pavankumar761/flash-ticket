package com.flashticket.userservice.service.impl;

import com.flashticket.userservice.dto.login.LoginRequestDTO;
import com.flashticket.userservice.dto.login.LoginResponseDTO;
import com.flashticket.userservice.entity.User;
import com.flashticket.userservice.repository.UserRepository;
import com.flashticket.userservice.security.JwtUtils;
import com.flashticket.userservice.service.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author : Pavan Kumar
 * @created : 15/04/26, Wednesday
 */

@Service
@RequiredArgsConstructor
public class AuthService implements IAuthService {

    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;
    private final PasswordEncoder passwordEncoder;

    @Override
    public LoginResponseDTO login(LoginRequestDTO requestDTO) {
        User user = userRepository.findByEmail(requestDTO.getEmail()).orElseThrow(() -> new RuntimeException("User not Found"));

        if (!passwordEncoder.matches(requestDTO.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        String token = jwtUtils.generateToken(user.getEmail());
        return new LoginResponseDTO(token, user.getEmail());
    }
}
