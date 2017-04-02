package com.quisier.service;

import com.quisier.domain.User;

import java.util.Optional;

/**
 * Created by gustavosousa on 4/2/17.
 */
public interface UserService {
    public Optional<User> getByEmail(String username);
}
