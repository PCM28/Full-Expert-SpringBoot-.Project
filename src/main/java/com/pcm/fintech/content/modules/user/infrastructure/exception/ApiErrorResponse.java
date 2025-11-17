package com.pcm.fintech.content.modules.user.infrastructure.exception;

import java.time.LocalDateTime;

public record ApiErrorResponse(
        LocalDateTime timestamp,
        Integer status,
        String message,
        String error,
        String path,
        String code
) {}
