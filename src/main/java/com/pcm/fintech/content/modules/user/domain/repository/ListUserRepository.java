package com.pcm.fintech.content.modules.user.domain.repository;

import com.pcm.fintech.content.modules.user.domain.entity.User;

import java.util.List;

public interface ListUserRepository {
    List<User> findAll();
}
