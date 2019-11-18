package com.myjavablog.service;

import com.myjavablog.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    public User findUserByEmail(String email) ;
    public User saveUser(User user);
}
