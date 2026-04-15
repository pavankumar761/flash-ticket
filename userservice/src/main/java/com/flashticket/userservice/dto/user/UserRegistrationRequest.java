package com.flashticket.userservice.dto.user;

import lombok.Data;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

@Data
public class UserRegistrationRequest {
    private String email;
    private String password;
    private String name;
}
