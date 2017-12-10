package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.exception.HttpCode;
import java.util.List;

public class McRestListCustomPageableResponse<T> extends McBaseRestResponse{
  private static final long serialVersionUID = -2574939171568902542L;

  private List<T> content;

  private PageMetaData pageMetaData;

  public McRestListCustomPageableResponse(String requestId, HttpCode httpCode, String message, List<T> content,
      PageMetaData pageMetaData) {
    super(requestId, httpCode, message);
    this.content = content;
    this.pageMetaData = pageMetaData;
  }

  public McRestListCustomPageableResponse(String requestId, HttpCode httpCode, List<T> content,
      PageMetaData pageMetaData) {
    super(requestId, httpCode);
    this.content = content;
    this.pageMetaData = pageMetaData;
  }

  public List<T> getContent() {
    return content;
  }

  public void setContent(List<T> content) {
    this.content = content;
  }

  public PageMetaData getPageMetaData() {
    return pageMetaData;
  }

  public void setPageMetaData(PageMetaData pageMetaData) {
    this.pageMetaData = pageMetaData;
  }
}
