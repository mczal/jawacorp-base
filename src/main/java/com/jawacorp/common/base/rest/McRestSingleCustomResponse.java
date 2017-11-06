package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.rest.error.HttpCode;

/**
 * Created by Gl552 on 3/22/2017.
 */
public class McRestSingleCustomResponse<T> extends McBaseRestResponse {
  private static final long serialVersionUID = -7687646491730702378L;

  private T value;

  public McRestSingleCustomResponse(String requestId, HttpCode httpCode, String success, T value) {
    super(requestId, httpCode, success);
    this.value = value;
  }

  public McRestSingleCustomResponse(String requestId, HttpCode httpCode, T value) {
    super(requestId, httpCode);
    this.value = value;
  }

  public T getValue() {

    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
