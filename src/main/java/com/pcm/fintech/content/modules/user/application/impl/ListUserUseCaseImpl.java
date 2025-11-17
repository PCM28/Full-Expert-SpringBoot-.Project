package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.ListUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.ListUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListUserUseCaseImpl implements ListUserUseCase {

    private final ListUserRepository listUserRepository;

    @Override
    public List<User> getAllUsers(Pageable pageable) {
        return List.of();
    }

    @Override
    public List<User> listUsers() {
        return listUserRepository.findAll(); //Los filtros, paginación, orden, etc., se añaden luego
    }
}
