package com.quisier.config.security.jwt;

/**
 * Created by gustavosousa on 4/1/17.
 */
public interface TokenExtractor {
    public String extract(String payload);
}
