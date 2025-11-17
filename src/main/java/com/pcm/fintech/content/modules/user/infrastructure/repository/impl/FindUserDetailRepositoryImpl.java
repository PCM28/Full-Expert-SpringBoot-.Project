package com.pcm.fintech.content.modules.user.infrastructure.repository.impl;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository.UserJpaRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.mapper.UserJpaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FindUserDetailRepositoryImpl implements FindUserDetailRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserJpaMapper userJpaMapper;

    @Override
    public Optional<User> findById(Long id) {
        return userJpaRepository.findById(id).map(userJpaMapper::toDomain); // userJpaMapper::toDomain porqué lo ha usado -> GPT
    }
}
