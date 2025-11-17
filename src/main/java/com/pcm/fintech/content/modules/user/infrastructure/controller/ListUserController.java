package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.usecase.ListUserUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class ListUserController {
    private final ListUserUseCase listUserUseCase;

    @GetMapping
    public ResponseEntity<List<UserOutputDto>> listUsers() {
        List<UserOutputDto> userOutputDtos = listUserUseCase.listUsers();
        return ResponseEntity.ok(userOutputDtos);
    }
}
