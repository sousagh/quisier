package com.quisier.config.security;

import com.quisier.domain.User;
import com.quisier.service.DummyUserService;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Component
public class AjaxAuthenticationProvider implements AuthenticationProvider {

    private final DummyUserService userService;

    @Autowired
    public AjaxAuthenticationProvider(final DummyUserService userService) {
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Assert.notNull(authentication, "No authentication data provided");

        String email = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        User user = userService.getByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));

        if (password.equals(user.getPassword())) {
            throw new BadCredentialsException("Authentication Failed. Username or Password not valid.");
        }

        if (user.getRoles() == null) throw new InsufficientAuthenticationException("User has no roles assigned");

        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.name()))
                .collect(Collectors.toList());


        UserContext userContext = UserContext.create(user.getEmail(), authorities);

        return new UsernamePasswordAuthenticationToken(userContext, null, userContext.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
