package com.pcm.fintech.content.modules.user.infrastructure.repository.mapper;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.entity.UserJpa;

public interface UserJpaMapper {
    UserJpa toJpa(User domain);
    User toDomain(UserJpa jpa);
}
