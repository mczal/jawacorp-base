package com.jawacorp.common.base;

import java.io.Serializable;

/**
 * Created by Gl552 on 11/12/2016.
 */

public class McBaseRequest implements Serializable {

  private static final long serialVersionUID = 7521154277176709904L;

  private String id;

  private Long version;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }
}
