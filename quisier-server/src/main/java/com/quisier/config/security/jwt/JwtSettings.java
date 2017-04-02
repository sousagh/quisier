package com.quisier.config.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Configuration
@ConfigurationProperties(prefix = "demo.security.jwt")
public class JwtSettings {

    /**
     * Ten minutes
     */
    private final Integer tokenExpirationTime = 1 * 60 * 1000 ;
    /**
     * Ten hours
     */
    private final Integer refreshTokenExpTime = 10 * 60 * 60 * 1000;
    /**
     * Token issuer.
     */
    private String tokenIssuer = "Quisier.com";

    /**
     * Key is used to sign {@link JwtToken}.
     */
    private String tokenSigningKey = "8EV6HyMYKEYCIDAwQus";


    public Integer getRefreshTokenExpTime() {
        return refreshTokenExpTime;
    }

    public Integer getTokenExpirationTime() {
        return tokenExpirationTime;
    }


    public String getTokenIssuer() {
        return tokenIssuer;
    }

    public String getTokenSigningKey() {
        return tokenSigningKey;
    }

}
