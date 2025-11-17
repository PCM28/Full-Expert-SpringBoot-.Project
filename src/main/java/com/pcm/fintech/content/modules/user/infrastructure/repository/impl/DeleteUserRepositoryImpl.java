package com.pcm.fintech.content.modules.user.infrastructure.repository.impl;

import com.pcm.fintech.content.modules.user.domain.repository.DeleteUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.repository.UserJpaRepository;
import com.pcm.fintech.content.modules.user.infrastructure.repository.mapper.UserJpaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class DeleteUserRepositoryImpl implements DeleteUserRepository {
    private final UserJpaRepository userJpaRepository;

    @Override
    public void deleteUserById(Long id) {
        userJpaRepository.deleteById(id);
    }
}
