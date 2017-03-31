package com.quiser.present;

import com.quiser.business.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class TrueResponse extends Response {
    private final UserInfo data;

    public TrueResponse(boolean success, UserInfo data) {
        super(success);
        this.data = data;
    }
}
