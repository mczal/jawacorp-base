package com.jawacorp.common.base.exception;

import org.springframework.validation.BindingResult;

/**
 * Created by Gl552 on 12/11/2016.
 */
public class ApplicationException extends Exception {

  private static final long serialVersionUID = 5651924131738244357L;

  private HttpCode code;

  private String message;

  public ApplicationException(HttpCode code) {
    super(code.message());
    this.message = code.message();
    this.code = code;
  }

  public ApplicationException(HttpCode code, String message) {
    super(code.message());
    this.message = message;
    this.code = code;
  }

  public ApplicationException(HttpCode code, BindingResult bindingResult) {
    super(bindingResult.getFieldError().getField() + " [" + bindingResult.getFieldError().
        getDefaultMessage() + "]");
    this.code = code;
    this.message =
        bindingResult.getFieldError().getField() + " [" + bindingResult.getFieldError().
            getDefaultMessage() + "]";
  }

  public HttpCode getErrorCode() {
    return code;
  }

  public void setErrorCode(HttpCode code) {
    this.code = code;
  }
}
