package com.pcm.fintech.content.modules.user.application.exception;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException() {
    super("User must exist");
  }
  // EmailAlreadyExistsException también va en este listado de exception dentro de Application Layer
}
