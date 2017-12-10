package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.exception.HttpCode;

/**
 * Created by mczal on 31-Jul-17.
 */
public class McBaseRestResponse extends McBaseRest {

  private static final long serialVersionUID = 3795233947419136079L;

  private String literal;

  private String message;

  private int statusCode;

  public McBaseRestResponse(String requestId, HttpCode httpCode) {
    super(requestId);
    this.statusCode = httpCode.code();
    this.literal = httpCode.name();
    this.message = httpCode.message();
  }

  public McBaseRestResponse(String requestId, HttpCode httpCode, String message) {
    super(requestId);
    this.statusCode = httpCode.code();
    this.literal = httpCode.name();
    this.message = message;
  }

  public String getLiteral() {
    return literal;
  }

  public String getMessage() {
    return message;
  }

  public int getStatusCode() {
    return statusCode;
  }

}
