package com.flashticket.userservice.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Pavan Kumar
 * @created : 15/04/26, Wednesday
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    public String jwt;
    private String email;
}
