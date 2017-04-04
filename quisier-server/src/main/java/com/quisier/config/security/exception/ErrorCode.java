package com.quisier.config.security.exception;

/**
 * Created by gustavosousa on 4/2/17.
 */
public enum ErrorCode {
    GLOBAL(2),

    AUTHENTICATION(10), JWT_TOKEN_EXPIRED(11);

    private int errorCode;

    private ErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    public int getErrorCode() {
        return errorCode;
    }
}