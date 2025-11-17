package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;

public interface FindUserDetailUseCase {
    UserOutputDto getUserById(Long id);
}
