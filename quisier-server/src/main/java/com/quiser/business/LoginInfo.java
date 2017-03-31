package com.quiser.business;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by yf_zh on 3/29/2017.
 */
@AllArgsConstructor
public class LoginInfo {
    @Getter
    private final String email;
    @Getter
    private final String password;

}
