package com.jawacorp.common.base.exception;

import org.springframework.validation.BindingResult;

/**
 * Created by Gl552 on 12/11/2016.
 */
public class ApplicationException extends Exception {

  private static final long serialVersionUID = 5651924131738244357L;

  private ErrorCategory errorCode;

  private String errorMessage;

  public ApplicationException() {
    super(ErrorCategory.UNSPECIFIED.getMessage());
    this.errorCode = ErrorCategory.UNSPECIFIED;
    this.errorMessage = ErrorCategory.UNSPECIFIED.getMessage();
  }

  public ApplicationException(ErrorCategory errorCode) {
    super(errorCode.getMessage());
    this.errorMessage = errorCode.getMessage();
    this.errorCode = errorCode;
  }

  public ApplicationException(ErrorCategory errorCode, String errorMessage) {
    super(errorCode.getMessage());
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
  }

  public ApplicationException(ErrorCategory errorCategory, BindingResult bindingResult) {
    super(bindingResult.getFieldError().getField() + " [" + bindingResult.getFieldError().
        getDefaultMessage() + "]");
    this.errorCode = errorCategory;
    this.errorMessage =
        bindingResult.getFieldError().getField() + " [" + bindingResult.getFieldError().
            getDefaultMessage() + "]";
  }

  public ErrorCategory getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCategory errorCodes) {
    this.errorCode = errorCodes;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
