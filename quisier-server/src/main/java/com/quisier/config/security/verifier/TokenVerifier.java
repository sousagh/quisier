package com.quisier.config.security.verifier;

/**
 * Created by gustavosousa on 4/2/17.
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
