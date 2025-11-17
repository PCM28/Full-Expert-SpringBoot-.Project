package com.pcm.fintech.content.modules.user.domain.repository;

import com.pcm.fintech.content.modules.user.domain.entity.User;

import java.util.Optional;

public interface FindUserDetailRepository {
    Optional<User> findById(Long id);
}
