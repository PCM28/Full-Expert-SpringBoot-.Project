package com.pcm.fintech.content.modules.user.domain.repository;

import com.pcm.fintech.content.modules.user.domain.entity.User;

public interface UpdateUserRepository {
    User update(Long id, User user); //throws NotFoundException
}
