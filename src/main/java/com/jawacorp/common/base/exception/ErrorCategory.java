package com.jawacorp.common.base.exception;

/**
 * Created by Gl552 on 12/11/2016.
 */
public enum ErrorCategory {
  DATA_NOT_FOUND("Can not find data "),
  INVALID_STATE("System/data are in invalid state "),
  REQUIRED_PARAMETER("Incomplete required parameter data "),
  UNSPECIFIED("Unspecified error "),
  NOT_ALLOWED("Operations are not allowed by the system"),
  NOT_AUTHORIZED("Cannot authorize your credentials"),
  NOT_AUTHENTICATED("Not authenticated"),
  VALIDATION_CONSTRAINT("Validation constraint"),
  VIOLATION("Violation Attempt. Locking account...");

  private String message;

  ErrorCategory(String message) {
    this.message = message;
  }

  public String getCode() {
    return this.name();
  }

  public String getMessage() {
    return this.message + ":";
  }
}
