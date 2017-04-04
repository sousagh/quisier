package com.quisier.config.security;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.quisier.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;



public class JwtUserFactory {

    public static JwtUser create(User user) {

        List<GrantedAuthority> authorities  = Arrays.asList(new SimpleGrantedAuthority(user.getType().name()));

        return new JwtUser(user.getId(), user.getEmail(), user.getFirstName(), user.getLastName(), user.getPassword(),
                authorities);
    }

}