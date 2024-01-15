package com.example.empiretechtestbackendjava.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@AllArgsConstructor
@ConfigurationProperties(prefix = "jwt")
public class JwtPropertiesConfig {
    private String secretKey;
    private String tokenPrefix;
    private String tokenHeader;
    private long expirationTime;
}
