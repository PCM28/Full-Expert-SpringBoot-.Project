package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.ListUserUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserUseCaseImpl implements ListUserUseCase {
    @Override
    public List<UserOutputDto> getAllAlbums(Pageable pageable) {
        return List.of();
    }
}
