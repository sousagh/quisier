package com.quisier.config.security.jwt;

/**
 * Created by gustavosousa on 4/1/17.
 */
public enum Scopes {
    REFRESH_TOKEN;

    public String authority() {
        return "ROLE_" + this.name();
    }
}
