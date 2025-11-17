package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.usecase.CreateUserUseCase;
import com.pcm.fintech.content.modules.user.infrastructure.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.dto.output.UserOutputDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class CreateUserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping("/create")
    public ResponseEntity<UserOutputDto> create(@Valid @RequestBody UserInputDto userInputDto) {
        UserOutputDto userOutputDto = createUserUseCase.addUser(userInputDto);
        return ResponseEntity.ok().body(userOutputDto);
    }
}
