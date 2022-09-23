package com.buydeem.web.config;

import com.buydeem.web.service.WebUserService;
import com.buydeem.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserService userService(){
        return new WebUserService();
    }
}
