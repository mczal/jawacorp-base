package com.jawacorp.common.base;

import java.io.Serializable;

/**
 * Created by Gl552 on 12/10/2016.
 */
@Deprecated
public class McPageMetaData implements Serializable {

  private static final long serialVersionUID = 3029473453434041407L;

  private long pageNumber = 0;

  private long pageSize = 0;

  private long totalRecords = 0;

  public long getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(long pageNumber) {
    this.pageNumber = pageNumber;
  }

  public long getPageSize() {
    return pageSize;
  }

  public void setPageSize(long pageSize) {
    this.pageSize = pageSize;
  }

  public long getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(long totalRecords) {
    this.totalRecords = totalRecords;
  }
}
