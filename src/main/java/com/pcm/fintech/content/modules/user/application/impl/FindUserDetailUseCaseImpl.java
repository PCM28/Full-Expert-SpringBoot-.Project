package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.FindUserDetailUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserDetailUseCaseImpl implements FindUserDetailUseCase {
    private final FindUserDetailRepository findUserDetailRepository;
    private final UserMapper userMapper;

    @Override
    public UserOutputDto getUserById(Long id) {
        User user = findUserDetailRepository.findById(id).orElseThrow(); //() -> new UserNotFoundException(id), esto dentro de orElseThrow
        return userMapper.userToUserOutputDto(user);
    }
}
