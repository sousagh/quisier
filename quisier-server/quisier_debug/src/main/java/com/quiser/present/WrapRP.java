package com.quiser.present;

import com.quiser.business.UserInfo;

import java.util.List;

/**
 * Created by yf_zh on 3/31/2017.
 */
public interface WrapRP<T> {
    void save(UserInfo userInfo);
    UserInfo findByEmail(String email);
}
