package com.quiser.present;

import com.quiser.business.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by yf_zh on 3/31/2017.
 */
public abstract class Response {
    public boolean success;

    public Response(boolean success) {
        this.success = success;
    }
}
