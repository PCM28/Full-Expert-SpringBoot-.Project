package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.infrastructure.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;

public interface CreateUserUseCase {
    UserOutputDto addUser(UserInputDto userInputDto);
}
