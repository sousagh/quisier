package com.quisier.config.security.jwt;

import io.jsonwebtoken.Claims;

/**
 * Created by gustavosousa on 4/1/17.
 */
public final class AccessJwtToken implements JwtToken {
    private final String rawToken;
    private Claims claims;

    protected AccessJwtToken(final String token, Claims claims) {
        this.rawToken = token;
        this.claims = claims;
    }

    public String getToken() {
        return this.rawToken;
    }

    public Claims getClaims() {
        return claims;
    }
}