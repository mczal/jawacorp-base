package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.exception.HttpCode;

/**
 * Created by Gl552 on 3/25/2017.
 */
public class McRestArrayCustomResponse<T> extends McBaseRestResponse {
  private static final long serialVersionUID = 2153615297490403631L;

  private T[] content;

  public McRestArrayCustomResponse(String requestId, HttpCode httpCode, String message,
      T[] content) {
    super(requestId, httpCode, message);
    this.content = content;
  }

  public McRestArrayCustomResponse(String requestId, HttpCode httpCode, T[] content) {
    super(requestId, httpCode);
    this.content = content;
  }

  public T[] getContent() {
    return content;
  }
}
