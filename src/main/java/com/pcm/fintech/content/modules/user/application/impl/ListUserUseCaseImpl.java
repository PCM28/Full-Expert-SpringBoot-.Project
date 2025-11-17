package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.ListUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.ListUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListUserUseCaseImpl implements ListUserUseCase {

    private final ListUserRepository listUserRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserOutputDto> getAllUsers(Pageable pageable) {
        return List.of();
    }

    @Override
    public List<UserOutputDto> listUsers() {
        List<User> users = listUserRepository.findAll();
        return users.stream().map(userMapper::userToUserOutputDto).toList(); //Los filtros, paginación, orden, etc., se añaden luego
    }
}
