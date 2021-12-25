package com.sdp.explorer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sdp.explorer.repositories.*;
import com.sdp.explorer.models.*;
import com.sdp.explorer.services.*;

@RestController
public class OwnerController {
    @Autowired
    public OwnerRegisterService as;

    @PostMapping("/registerowner")
    public RegisterOwner AdminRegistraionController(@RequestBody RegisterOwner a){
        return  as.registerOwner(a);
    }

    @PostMapping("/loginowner")
    public ApiResp LoginAdminController(@RequestBody LoginOwner l){
        return as.lognOwner(l);
    }

}
