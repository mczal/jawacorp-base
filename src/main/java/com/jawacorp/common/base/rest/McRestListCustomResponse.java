package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.rest.error.HttpCode;

import java.util.List;

/**
 * Created by Gl552 on 3/22/2017.
 */
public class McRestListCustomResponse<T> extends McBaseRestResponse {
  private static final long serialVersionUID = -2574939171568902542L;

  private List<T> content;

  public McRestListCustomResponse(String requestId, HttpCode httpCode, String message,
      List<T> content) {
    super(requestId, httpCode, message);
    this.content = content;
  }

  public McRestListCustomResponse(String requestId, HttpCode httpCode, List<T> content) {
    super(requestId, httpCode);
    this.content = content;
  }

  public List<T> getContent() {
    return content;
  }

  public void setContent(List<T> content) {
    this.content = content;
  }
}
