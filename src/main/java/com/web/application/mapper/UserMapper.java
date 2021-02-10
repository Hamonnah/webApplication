package com.web.application.mapper;

import com.web.application.domain.User;
import com.web.application.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapUserDtoToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName()
        );
    }

    public UserDto mapUserToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName()
        );
    }

}
