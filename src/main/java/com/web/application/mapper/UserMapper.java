package com.web.application.mapper;

import com.web.application.domain.User;
import com.web.application.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<UserDto> mapToUserDtoList(final List<User> usersList){
        return usersList.stream()
                .map(user -> new UserDto(user.getId(),user.getName()))
                .collect(Collectors.toList());
    }


}
