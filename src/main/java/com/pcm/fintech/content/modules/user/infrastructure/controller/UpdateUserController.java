package com.pcm.fintech.content.modules.user.infrastructure.controller;

import com.pcm.fintech.content.modules.user.application.mapper.UserMapper;
import com.pcm.fintech.content.modules.user.application.usecase.UpdateUserUseCase;
import com.pcm.fintech.content.modules.user.domain.entity.User;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input.UserInputDto;
import com.pcm.fintech.content.modules.user.infrastructure.controller.dto.output.UserOutputDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UpdateUserController {
    private final UpdateUserUseCase updateUserUseCase;
    private final UserMapper userMapper;

    @PutMapping("/{id}")
    public ResponseEntity<UserOutputDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserInputDto userInputDto
            ) {
        // DTO -> Domain
        User user = userMapper.userInputDtoToUser(userInputDto);
        // Use Case
        User updatedUser = updateUserUseCase.updateUser(id, user);
        // Domain -DTO
        UserOutputDto userOutputDto = userMapper.userToUserOutputDto(updatedUser);

        return ResponseEntity.ok(userOutputDto);
    }
}
