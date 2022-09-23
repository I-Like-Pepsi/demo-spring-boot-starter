package com.buydeem.web.service;

import com.buydeem.user.UserProperties;
import com.buydeem.user.UserService;
import com.buydeem.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class WebUserService implements UserService {

    @Autowired
    private UserProperties properties;
    @Override
    public User getUser() {
        return new User("WebUserService:"+properties.getUserName(),properties.getAge());
    }
}
