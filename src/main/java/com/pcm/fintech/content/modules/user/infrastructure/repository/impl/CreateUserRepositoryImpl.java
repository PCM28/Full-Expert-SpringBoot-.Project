package com.pcm.fintech.content.modules.user.infrastructure.repository.impl;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.CreateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.entity.UserJpa;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository.UserJpaRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.mapper.UserJpaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CreateUserRepositoryImpl implements CreateUserRepository {
    private final UserJpaRepository userJpaRepository;
    private final UserJpaMapper userJpaMapper;

    @Override
    public User create(User user) {
        UserJpa userJpa = userJpaMapper.toJpa(user);
        UserJpa savedUserJpa = userJpaRepository.saveAndFlush(userJpa); //Saber sie s una buenna práctica dejarlo como save o saveAndFlush
        return userJpaMapper.toDomain(savedUserJpa);
    }
}
