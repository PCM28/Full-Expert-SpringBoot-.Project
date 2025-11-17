package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;

public interface CreateUserUseCase {
    User addUser(User user);
}
