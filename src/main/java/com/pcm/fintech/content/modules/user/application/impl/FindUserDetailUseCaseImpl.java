package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.FindUserDetailUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import org.springframework.stereotype.Service;

@Service
public class FindUserDetailUseCaseImpl implements FindUserDetailUseCase {
    @Override
    public UserOutputDto getUserById(Long id) {
        return null;
    }
}
