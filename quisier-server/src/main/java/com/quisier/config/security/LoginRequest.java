package com.quisier.config.security;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Getter
@Setter
public class LoginRequest {

    private String password;

    public String email;

}
