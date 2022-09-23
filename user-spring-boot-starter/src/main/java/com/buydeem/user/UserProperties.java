package com.buydeem.user;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user")
@Data
public class UserProperties {
    private String userName = "mac";
    private Integer age = 18;
}
