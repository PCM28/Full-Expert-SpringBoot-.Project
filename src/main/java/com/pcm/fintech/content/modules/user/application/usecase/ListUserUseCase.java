package com.pcm.fintech.content.modules.user.application.usecase;

import com.pcm.fintech.content.modules.user.domain.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ListUserUseCase {
    List<User> getAllUsers(Pageable pageable);
    List<User> listUsers();
}
