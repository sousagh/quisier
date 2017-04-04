package com.quisier.service;

import com.quisier.config.security.JwtTokenUtil;
import com.quisier.config.security.JwtUserFactory;
import com.quisier.domain.User;
import com.quisier.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;

/**
 * Created by gustavosousa on 4/2/17.
 */
@Service
public class UserService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", email));
        } else {
            return JwtUserFactory.create(user);
        }

    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public String login(String email, String password)  {

        User user = userRepository.findByEmailAndPassword(email, password);

        if(user == null){
            throw new BadCredentialsException("Login failed");
        }

        return JwtTokenUtil.createJWT(user);

    }
}
