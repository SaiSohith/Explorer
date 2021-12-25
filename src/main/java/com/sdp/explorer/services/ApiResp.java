package com.sdp.explorer.services;

import com.sdp.explorer.models.RegisterOwner;

public class ApiResp {
    public int status;
    public String msg;
    public RegisterOwner ro;
    public ApiResp(int status, String msg, RegisterOwner ro) {
        this.status = status;
        this.msg = msg;
        this.ro = ro;
    }
}
