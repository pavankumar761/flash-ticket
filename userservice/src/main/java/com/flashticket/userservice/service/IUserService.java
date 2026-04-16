package com.flashticket.userservice.service;

import com.flashticket.userservice.dto.user.UserRegistrationRequest;
import com.flashticket.userservice.dto.user.UserResponseDTO;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

public interface IUserService {

    UserResponseDTO registerUser(UserRegistrationRequest request);

    UserResponseDTO getUserByEmail(String email);
}
