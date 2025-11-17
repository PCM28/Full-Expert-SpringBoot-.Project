package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.CreateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
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
    private final UserMapper userMapper;

    @PostMapping("/create")
    public ResponseEntity<UserOutputDto> create(@Valid @RequestBody UserInputDto userInputDto) {
        User user = userMapper.userInputDtoToUser(userInputDto);
        User created = createUserUseCase.addUser(user);
        UserOutputDto userOutputDto = userMapper.userToUserOutputDto(created);
        return ResponseEntity.ok().body(userOutputDto);
    }
}
