package com.quisier.config.security;

import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUser implements UserDetails {

    private static final long serialVersionUID = 3847365444944752699L;
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;
    private final Collection<? extends GrantedAuthority> authorities;


    public JwtUser(String id, String email, String firstNamne, String lastName, String password, List<GrantedAuthority> roles) {
        this.id = id;
        this.firstName = firstNamne;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.authorities = roles;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @Override
    public String getPassword() {
        return password;
    }


    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return email;
    }


    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }


}
