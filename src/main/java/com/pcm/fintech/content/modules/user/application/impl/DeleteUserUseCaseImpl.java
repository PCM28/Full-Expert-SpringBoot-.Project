package com.pcm.fintech.content.modules.user.application.impl;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.DeleteUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.domain.repository.DeleteUserRepository;
import com.pcm.fintech.content.modules.user.domain.repository.FindUserDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {
    private final FindUserDetailRepository findUserDetailRepository;
    private final DeleteUserRepository deleteUserRepository;

    @Override
    public void deleteUserById(Long id) {

        //1) If UserId does not exist
        findUserDetailRepository.findById(id).orElseThrow(); // () -> new UserNotFoundException(id), añadirlo al global Exception + averiguar si es buena práctica el dejar esos throw
        //2)  If UserID exists
        deleteUserRepository.deleteUserById(id);
    }
}
