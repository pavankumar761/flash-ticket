package com.flashticket.userservice.dto.user;

import lombok.Builder;
import lombok.Data;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String email;
    private String fullName;
}
