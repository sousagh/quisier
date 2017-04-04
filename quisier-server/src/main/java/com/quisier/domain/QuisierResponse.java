package com.quisier.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gustavosousa on 4/3/17.
 */
@Getter
@Setter
public class QuisierResponse {
    private Object data;
    private boolean success;
    private String message;
}
