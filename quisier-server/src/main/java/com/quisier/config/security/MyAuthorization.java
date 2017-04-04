package com.quisier.config.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * Created by gustavosousa on 4/2/17.
 */
public class MyAuthorization extends AbstractAuthenticationToken {

    private String subject;
    private String authToken;

    public MyAuthorization(String authToken) {
        super(null);
        super.setAuthenticated(false);
        this.authToken = authToken;
    }

    public MyAuthorization(String subject, List<GrantedAuthority> authorities) {
        super(authorities);
        this.subject = subject;
        super.setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return this.authToken;
    }

    @Override
    public Object getPrincipal() {
        return subject;
    }
}
