package com.buydeem.user;

import com.buydeem.user.model.User;

public interface UserService {
    /**
     * 通过用户名获取用户
     * @return 用户
     */
    User getUser();
}
