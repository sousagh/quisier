package com.quisier.service;

import com.quisier.domain.Role;
import com.quisier.domain.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by gustavosousa on 4/1/17.
 */
@Component
public class DummyUserService implements UserService {

    @Override
    public Optional<User> getByEmail(String username) {

        if("sousagh@gmail.com".equals(username)){
            User user = new User();
            user.setEmail(username);
            user.setFirstNamne("ustavo");
            user.setLastName("ousa");
            user.setPassword("$2a$06$gpYx2BP3mNUFkng2UyV6o.S8A1owEdMykRazQODJo8B5sBZdc9zBm");
            user.setRoles(Arrays.asList(Role.STUDENT, Role.TEACHER));

            return Optional.of(user);
        }
        return Optional.empty();
    }
}
