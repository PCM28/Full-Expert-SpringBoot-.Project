package com.pcm.fintech.content.modules.user.infrastructure.exception;

import com.pcm.fintech.content.modules.user.application.exception.UserNotFoundException;
import com.pcm.fintech.content.modules.user.domain.exception.TermsNotAcceptedException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private ApiErrorResponse buildError(HttpStatus status,
                                              String message,
                                              String code,
                                              HttpServletRequest request) {
        return new ApiErrorResponse(
                LocalDateTime.now(),
                status.value(),
                status.getReasonPhrase(),
                message,
                request.getRequestURI(),
                code
        );
    }

    // 1) Términos no aceptados (regla de dominio)
    @ExceptionHandler(TermsNotAcceptedException.class)
    public ResponseEntity<ApiErrorResponse> handleTermsNotAccepted(
            TermsNotAcceptedException ex,
            HttpServletRequest request
    ) {
        ApiErrorResponse body = buildError(HttpStatus.BAD_REQUEST, ex.getMessage(), "TERMS_NOT_ACCEPTED", request);
        return ResponseEntity.badRequest().body(body);
    }

    // 2) User no encontrado (Find, Update, Delete)
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleUserNotFound(
            UserNotFoundException ex,
            HttpServletRequest request
    ) {
        ApiErrorResponse body = buildError(HttpStatus.NOT_FOUND, ex.getMessage(), "USER_NOT_FOUND", request);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    // 3) Términos no aceptados (regla de dominio)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleValidation(
            MethodArgumentNotValidException ex,
            HttpServletRequest request
    ) {
        FieldError fieldError = ex.getBindingResult().getFieldErrors().stream().findFirst().orElse(null);
        String message = (fieldError != null) ? fieldError.getField() + " " + fieldError.getDefaultMessage() : "Validation error";
        ApiErrorResponse body = buildError(HttpStatus.BAD_REQUEST, message, "VALIDATION_ERROR", request);
        return ResponseEntity.badRequest().body(body);
    }

    // 4) Cualquier otra excepción no controlada
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handleGeneric(
            Exception ex,
            HttpServletRequest request
    ) {
        ApiErrorResponse body = buildError(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected error: " + ex.getMessage(), "INTERNAL_ERROR", request);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }

    /* - Extra -
    // 2) Email ya existe (Create / Update)
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ApiErrorResponse> handleEmailAlreadyExists(
            EmailAlreadyExistsException ex,
            HttpServletRequest request
    ) {
        var body = buildError(HttpStatus.CONFLICT, ex.getMessage(), "EMAIL_ALREADY_EXISTS", request);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
    } */
}
