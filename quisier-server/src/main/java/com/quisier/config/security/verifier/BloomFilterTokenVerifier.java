package com.quisier.config.security.verifier;

import org.springframework.stereotype.Component;

/**
 * Created by gustavosousa on 4/2/17.
 */
@Component
public class BloomFilterTokenVerifier implements TokenVerifier {
    @Override
    public boolean verify(String jti) {
        return true;
    }
}