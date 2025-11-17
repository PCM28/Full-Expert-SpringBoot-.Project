package com.pcm.fintech.content.modules.user.domain.repository;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ListUserRepository {
    List<User> getAll(Pageable pageable);
    List<User> findAll();
}
