package com.quiser.present;

import lombok.Getter;

/**
 * Created by yf_zh on 3/31/2017.
 */

@Getter
public class FalseResponse extends Response{
    private final String message;

    public FalseResponse(boolean result,String message) {
        super(result);
        this.message = message;
    }
}
