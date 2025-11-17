package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.infrastructure.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;

public interface UpdateUserUseCase {
    UserOutputDto updateUser(Long id, UserInputDto userInputDto);
}
