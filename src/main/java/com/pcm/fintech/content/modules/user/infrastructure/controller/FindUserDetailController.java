package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.usecase.FindUserDetailUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class FindUserDetailController {
    private final FindUserDetailUseCase findUserDetailUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<UserOutputDto> getUserById(@PathVariable Long id) {
        UserOutputDto userOutputDto = findUserDetailUseCase.getUserById(id);
        return ResponseEntity.ok(userOutputDto);
    }
}
