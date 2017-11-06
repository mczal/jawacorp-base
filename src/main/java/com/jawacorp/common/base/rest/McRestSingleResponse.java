package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.McBaseResponse;
import com.jawacorp.common.base.rest.error.HttpCode;

/**
 * Created by mczal on 29-Jan-17.
 */
public class McRestSingleResponse<T extends McBaseResponse> extends McBaseRestResponse {

  private static final long serialVersionUID = 4714912001837006063L;

  private T value;

  public McRestSingleResponse(String requestId, HttpCode httpCode, String success, T value) {
    super(requestId, httpCode, success);
    this.value = value;
  }

  public McRestSingleResponse(String requestId, HttpCode httpCode, T value) {
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
