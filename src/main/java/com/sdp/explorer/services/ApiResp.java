package com.sdp.explorer.services;

import com.sdp.explorer.models.RegisterOwner;

public class ApiResp {
    public int status;
    public String msg;
    public Object ro;
    public ApiResp(int status, String msg, Object ro) {
        this.status = status;
        this.msg = msg;
        this.ro = ro;
        System.out.println(ro.toString());
    }
}
