package com.buydeem.user;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserServiceAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public UserService userService(){
        return new DefaultUserService();
    }
}
