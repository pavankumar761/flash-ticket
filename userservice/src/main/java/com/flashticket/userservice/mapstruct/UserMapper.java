package com.flashticket.userservice.mapstruct;

import com.flashticket.userservice.dto.user.UserRegistrationRequest;
import com.flashticket.userservice.dto.user.UserResponseDTO;
import com.flashticket.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author : Pavan Kumar
 * @created : 14/04/26, Tuesday
 */

@Mapper(componentModel = "spring",uses = {User.class})
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toUser(UserRegistrationRequest request);

    UserResponseDTO toUserResponseDTO(User user);
}
