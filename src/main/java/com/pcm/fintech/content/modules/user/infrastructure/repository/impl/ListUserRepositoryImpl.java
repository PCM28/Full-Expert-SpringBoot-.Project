package com.pcm.fintech.content.modules.user.infrastructure.repository.impl;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.ListUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository.UserJpaRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.mapper.UserJpaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ListUserRepositoryImpl implements ListUserRepository {
    private final UserJpaRepository userJpaRepository;
    private final UserJpaMapper userJpaMapper;

    @Override
    public List<User> getAll(Pageable pageable) {
        return List.of();
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll().stream().map(userJpaMapper::toDomain).toList();
    }
}
