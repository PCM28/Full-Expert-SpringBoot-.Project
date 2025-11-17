package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.usecase.UpdateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import com.pcm.fintech.content.modules.user.domain.repository.UpdateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
    private final FindUserDetailRepository findUserDetailRepository;
    private final UpdateUserRepository updateUserRepository;

    @Override
    public User updateUser(Long id, User user) {
        // 1) validing usuer exists
        User existing = findUserDetailRepository.findById(id).orElseThrow(); //() -> new UserNotFoundException(id)
        // 2) Add changes
        existing.setFirstName(user.getFirstName());
        // El resto ....

        // 3) Upload and return updated user
        return updateUserRepository.update(id, existing);
    }
}
