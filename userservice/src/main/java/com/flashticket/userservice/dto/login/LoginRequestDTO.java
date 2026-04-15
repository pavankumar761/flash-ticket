package com.flashticket.userservice.dto.login;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author : Pavan Kumar
 * @created : 15/04/26, Wednesday
 */

@Data
public class LoginRequestDTO {
    @NotEmpty(message = "Please pass email")
    public String email;
    @NotEmpty(message = "Please pass password")
    public String password;
}
