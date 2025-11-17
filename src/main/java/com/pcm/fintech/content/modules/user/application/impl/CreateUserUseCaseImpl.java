package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.CreateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.CreateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserRepository createUserRepository;
    private final UserMapper userMapper;
    // private final ExistsUserByEmailRepository existsUserByEmailRepository;

    @Override
    public UserOutputDto addUser(UserInputDto userInputDto) {

        User user = userMapper.userInputDtoToUser(userInputDto);
        // Regla de negocio: email único
        //if (existsUserByEmailRepository.existsByEmail(user.getEmail())) {
        //    throw new EmailAlreadyExistsException(user.getEmail());
        //}
        User saved = createUserRepository.create(user);
        return userMapper.userToUserOutputDto(saved);
    }
}
