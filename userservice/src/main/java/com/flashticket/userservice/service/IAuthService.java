package com.flashticket.userservice.service;

import com.flashticket.userservice.dto.login.LoginRequestDTO;
import com.flashticket.userservice.dto.login.LoginResponseDTO;

/**
 * @author : Pavan Kumar
 * @created : 15/04/26, Wednesday
 */

public interface IAuthService {
    LoginResponseDTO login(LoginRequestDTO requestDTO);
}
