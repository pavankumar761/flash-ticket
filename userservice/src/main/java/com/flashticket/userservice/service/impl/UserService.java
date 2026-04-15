package com.flashticket.userservice.service.impl;

import com.flashticket.userservice.dto.user.UserRegistrationRequest;
import com.flashticket.userservice.dto.user.UserResponseDTO;
import com.flashticket.userservice.entity.User;
import com.flashticket.userservice.mapstruct.UserMapper;
import com.flashticket.userservice.repository.UserRepository;
import com.flashticket.userservice.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDTO registerUser(UserRegistrationRequest request) {
        User user = userMapper.toUser(request);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        return userMapper.toUserResponseDTO(savedUser);
    }
}
