package com.quisier.domain;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Getter
@Setter
public class User {

    private String id;
    private String email;
    private String firstNamne;
    private String lastName;
    private String password;
    private List<Role> roles;


}
