package com.pcm.fintech.content.modules.user.domain.exception;

public class TermsNotAcceptedException extends RuntimeException {
  public TermsNotAcceptedException() {
    super("User must accept the terms and conditions");
  }
}
