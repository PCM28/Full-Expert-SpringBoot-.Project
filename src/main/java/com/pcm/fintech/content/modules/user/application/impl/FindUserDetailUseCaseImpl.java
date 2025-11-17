package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.FindUserDetailUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserDetailUseCaseImpl implements FindUserDetailUseCase {
    private final FindUserDetailRepository findUserDetailRepository;

    @Override
    public User getUserById(Long id) {
        return findUserDetailRepository.findById(id).orElseThrow(); //() -> new UserNotFoundException(id), esto dentro de orElseThrow
    }
}
