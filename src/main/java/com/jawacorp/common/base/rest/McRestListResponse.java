package com.jawacorp.common.base.rest;

import com.jawacorp.common.base.McBaseResponse;
import com.jawacorp.common.base.exception.HttpCode;

import java.util.List;

/**
 * Created by mczal on 29-Jan-17.
 */
public class McRestListResponse<T extends McBaseResponse> extends McBaseRestResponse {

  private static final long serialVersionUID = -4161303520501659519L;

  private List<T> content;

  private PageMetaData pageMetaData;

  public McRestListResponse(String requestId, HttpCode httpCode, String message, List<T> content,
      PageMetaData pageMetaData) {
    super(requestId, httpCode, message);
    this.content = content;
    this.pageMetaData = pageMetaData;
  }

  public McRestListResponse(String requestId, HttpCode httpCode, List<T> content,
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
