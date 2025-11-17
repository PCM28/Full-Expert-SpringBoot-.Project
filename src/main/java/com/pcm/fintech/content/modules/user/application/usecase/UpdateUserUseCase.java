package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;

public interface UpdateUserUseCase {
    UserOutputDto updateUser(Long id, UserInputDto userInputDto);
}
