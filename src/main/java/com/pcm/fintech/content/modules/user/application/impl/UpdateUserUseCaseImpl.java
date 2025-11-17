package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.UpdateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import com.pcm.fintech.content.modules.user.domain.repository.UpdateUserRepository;
import com.pcm.fintech.content.modules.user.infrastructure.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {
    private final FindUserDetailRepository findUserDetailRepository;
    private final UpdateUserRepository updateUserRepository;
    private final UserMapper userMapper;

    @Override
    public UserOutputDto updateUser(Long id, UserInputDto userInputDto) {


        // 1) validing usuer exists
        User existing = findUserDetailRepository.findById(id).orElseThrow(); //() -> new UserNotFoundException(id)
        // 2) Add changes
        User newUser = userMapper.userInputDtoToUser(userInputDto);
        existing.setFirstName(newUser.getFirstName());
        // El resto ....

        // 3) Upload and return updated user
        User updated = updateUserRepository.update(existing);
        return userMapper.userToUserOutputDto(updated);
    }
}
