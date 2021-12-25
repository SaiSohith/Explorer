package com.sdp.explorer.repositories;

import com.sdp.explorer.models.RegisterOwner;
import com.sdp.explorer.controllers.*;
import com.sdp.explorer.services.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RegisterOwnerRepositry extends JpaRepository<RegisterOwner,Integer> {
    public RegisterOwner findByEmail(String email);
}
