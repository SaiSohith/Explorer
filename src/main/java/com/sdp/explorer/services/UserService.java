package com.sdp.explorer.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.sdp.explorer.repositories.*;
import com.sdp.explorer.controllers.*;
import com.sdp.explorer.models.*;

public class UserService {
	@Autowired
	public UserRepository ur;
	
	public RegisterUser registerUser(RegisterUser u) {
		return ur.save(u);
	}

}
