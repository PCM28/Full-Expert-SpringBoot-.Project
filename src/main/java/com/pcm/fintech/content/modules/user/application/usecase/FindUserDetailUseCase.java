package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.domain.entity.User;

public interface FindUserDetailUseCase {
    User getUserById(Long id);
}
