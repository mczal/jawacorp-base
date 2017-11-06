package com.jawacorp.common.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Gl552 on 11/12/2016.
 */
public class McBaseResponse implements Serializable {

  private static final long serialVersionUID = -1600034392004090249L;

  private Date createdDate;

  private String id;

  private Boolean markForDelete;

  private Date updatedDate;

  private Long version;

  public McBaseResponse() {
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Boolean getMarkForDelete() {
    return markForDelete;
  }

  public void setMarkForDelete(Boolean markForDelete) {
    this.markForDelete = markForDelete;
  }

  public Date getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
