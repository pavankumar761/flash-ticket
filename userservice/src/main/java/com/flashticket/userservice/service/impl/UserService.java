package com.flashticket.userservice.service.impl;

import com.flashticket.userservice.dto.user.UserRegistrationRequest;
import com.flashticket.userservice.dto.user.UserResponseDTO;
import com.flashticket.userservice.entity.User;
import com.flashticket.userservice.mapstruct.UserMapper;
import com.flashticket.userservice.repository.UserRepository;
import com.flashticket.userservice.service.IUserService;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

public class UserService implements IUserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDTO registerUser(UserRegistrationRequest request) {
        User user = userMapper.toUser(request);
        User savedUser = userRepository.save(user);
        return userMapper.toUserResponseDTO(savedUser);
    }
}
