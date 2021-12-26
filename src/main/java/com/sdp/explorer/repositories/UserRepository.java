package com.sdp.explorer.repositories;

import org.springframework.data.repository.CrudRepository;
import com.sdp.explorer.models.*;
import com.sdp.explorer.controllers.*;
import com.sdp.explorer.services.*;

public interface UserRepository extends CrudRepository<RegisterUser,Integer>{
    public RegisterUser findByEmail(String email);
    public RegisterUser findById(int uid);
}
