package com.sdp.explorer.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.sdp.explorer.repositories.*;
import com.sdp.explorer.controllers.*;
import com.sdp.explorer.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;


@Service
public class UserService {
	@Autowired
	public UserRepository ur;

	@Autowired
	public OwnerHomestayrepo oh;

	public RegisterUser registerUser(RegisterUser u) {
		return ur.save(u);
	}

	public ApiResp loginUser(LoginUser u){
		RegisterUser o = ur.findByEmail(u.getEmail());
		if(o!=null && o.getPsw().equals(u.getPsw())) return  new ApiResp(200,"success",o);
		return new ApiResp(403,"incorrect credentials",null);
	}

	public ApiResp getUserdetails(int uid){
		RegisterUser up = ur.findById(uid);
		if(up!=null){
			return new ApiResp(200,"success",up);
		}
		return new ApiResp(403,"user not found",null);
	}

	public ApiResp getHomestays(){
		System.out.println();
		return new ApiResp(200,"success",oh.findAll());
	}

}
