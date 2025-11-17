package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.ListUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ListUserController {
    private final ListUserUseCase listUserUseCase;
    private final UserMapper userMapper;

    public ResponseEntity<List<UserOutputDto>> listUsers() {
        List<User> users = listUserUseCase.listUsers();
        List<UserOutputDto> userOutputDtos = users.stream().map(userMapper::userToUserOutputDto).toList();
        return ResponseEntity.ok(userOutputDtos);
    }
}
