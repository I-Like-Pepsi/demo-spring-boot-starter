package com.buydeem.user;

import com.buydeem.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultUserService implements UserService{

    @Autowired
    private UserProperties properties;

    @Override
    public User getUser() {
        return new User("DefaultUserService:"+properties.getUserName(),properties.getAge());
    }
}
