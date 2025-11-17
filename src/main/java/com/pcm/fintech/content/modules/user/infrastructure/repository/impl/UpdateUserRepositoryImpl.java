package com.pcm.fintech.content.modules.user.infrastructure.repository.impl;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.UpdateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.entity.UserJpa;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository.UserJpaRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.mapper.UserJpaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UpdateUserRepositoryImpl implements UpdateUserRepository {
    private final UserJpaRepository userJpaRepository;
    private final UserJpaMapper userJpaMapper;

    @Override
    public User update(User user) {
        UserJpa userJpa = userJpaMapper.toJpa(user);
        UserJpa UpdatedUserJpa = userJpaRepository.saveAndFlush(userJpa);
        return userJpaMapper.toDomain(UpdatedUserJpa);
    }
}
