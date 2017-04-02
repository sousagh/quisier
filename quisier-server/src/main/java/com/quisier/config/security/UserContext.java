package com.quisier.config.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Getter
@Setter
public class UserContext {

    private String username;
    private List<GrantedAuthority> authorities;

    private UserContext(){

    }

    public static UserContext create(String email, List<GrantedAuthority> authorities) {
        UserContext userContext = new UserContext();
        userContext.setUsername(email);
        userContext.setAuthorities(authorities);

        return userContext;
    }
}
