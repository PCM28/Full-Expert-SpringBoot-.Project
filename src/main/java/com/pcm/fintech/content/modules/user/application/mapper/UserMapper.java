package com.pcm.fintech.content.modules.user.application.mapper;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserOutputDto userToUserOutputDto(User user);
    User userInputDtoToUser(UserInputDto userInputDto);
}
