package com.jawacorp.common.base.exception.rest;

import com.jawacorp.common.base.exception.HttpCode;
import org.springframework.validation.BindingResult;

/**
 * Created by mczal on 29-Jan-17.
 */
public class RestException extends RuntimeException {

  private static final long serialVersionUID = -3857932178561647850L;

  private HttpCode httpCode;

  private String requestId;

  public RestException(String requestId, HttpCode httpCode) {
    super(httpCode.name());
    this.httpCode = httpCode;
    this.requestId = requestId;
  }

  public RestException(String requestId, HttpCode httpCode, String message) {
    super(message);
    this.httpCode = httpCode;
    this.requestId = requestId;
  }

  public RestException(String requestId, HttpCode httpCode, BindingResult bindingResult) {
    super(bindingResult.getFieldError().getField() + " [" + bindingResult.getFieldError().
        getDefaultMessage() + "]");
    this.httpCode = httpCode;
    this.requestId = requestId;
  }

  public HttpCode getHttpCode() {
    return httpCode;
  }

  public String getRequestId() {
    return requestId;
  }

}
