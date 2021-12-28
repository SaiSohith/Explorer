package com.sdp.explorer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sdp.explorer.repositories.*;
import com.sdp.explorer.models.*;
import com.sdp.explorer.services.*;


@RestController
public class UserController {

    @Autowired
    public UserService us;

    @PostMapping("/registeruser")
    public RegisterUser registerUser(@RequestBody RegisterUser u){
        System.out.println(u.getEmail()+" "+u.getPsw());
        return us.registerUser(u);
    }

    @PostMapping("/loginuser")
    public ApiResp loginUser(@RequestBody LoginUser u){
        System.out.println(u.getEmail()+" "+u.getPsw());
        return us.loginUser(u);
    }

    @GetMapping("/user/{uid}")
    public ApiResp getUserByID(@PathVariable("uid") int uid){
        return us.getUserdetails(uid);
    }

    @GetMapping("/homestays")
    public ApiResp getAllhomestays(){
        return  us.getHomestays();
    }

    @GetMapping("/homestays/{id}")
    public ApiResp getHomestaybyId(@PathVariable int id){
        return  us.getHomestaysbyId(id);
    }

}
