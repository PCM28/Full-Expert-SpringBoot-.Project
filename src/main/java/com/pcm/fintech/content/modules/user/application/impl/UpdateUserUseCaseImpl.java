package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.UpdateUserUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
    @Override
    public UserOutputDto updateUser(Long id, UserInputDto userInputDto) {
        return null;
    }
}
