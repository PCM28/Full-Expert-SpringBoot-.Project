package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ListUserUseCase {
    List<UserOutputDto> getAllAlbums(Pageable pageable);
}
