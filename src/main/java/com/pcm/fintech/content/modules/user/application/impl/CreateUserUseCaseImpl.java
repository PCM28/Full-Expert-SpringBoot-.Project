package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.CreateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.CreateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserRepository createUserRepository;
    private final UserMapper userMapper;

    @Override
    public User addUser(UserInputDto userInputDto) {
        User user = userMapper.userInputDtoToUser(userInputDto); // Entre estas 2 líneas puedo añadir otro método que verifique una reserva y otro campo
        return createUserRepository.create(user);
    }
}
