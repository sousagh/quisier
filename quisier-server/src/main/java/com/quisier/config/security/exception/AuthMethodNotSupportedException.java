package com.quisier.config.security.exception;

import org.springframework.security.authentication.AuthenticationServiceException;

/**
 * Created by gustavosousa on 4/1/17.
 */
public class AuthMethodNotSupportedException extends AuthenticationServiceException {
    private static final long serialVersionUID = 3705043083010304496L;

    public AuthMethodNotSupportedException(String msg) {
        super(msg);
    }
}

