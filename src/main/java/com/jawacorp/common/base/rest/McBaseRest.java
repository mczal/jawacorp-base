package com.jawacorp.common.base.rest;

import java.io.Serializable;

/**
 * Created by mczal on 29-Jan-17.
 */
public class McBaseRest implements Serializable{

    private static final long serialVersionUID = 5822001912319336943L;

    private String requestId;

    public McBaseRest(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
