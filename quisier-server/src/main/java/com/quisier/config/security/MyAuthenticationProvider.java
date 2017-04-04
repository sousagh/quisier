package com.quisier.config.security;

import io.jsonwebtoken.Claims;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gustavosousa on 4/2/17.
 */
@Component
public class MyAuthenticationProvider  implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        try {
            String token = (String) authentication.getCredentials();

            JwtTokenUtil.parseJWT(token);

            Claims jwsClaims = JwtTokenUtil.getClaimsFromToken(token);
            String subject = jwsClaims.getSubject();
            String scopes = (String) jwsClaims.get("scopes");
            List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_" +scopes));

            return new MyAuthorization(subject, authorities);

        }catch (Exception e){
            throw new BadCredentialsException("Exception nessage",e);
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (MyAuthorization.class.isAssignableFrom(authentication));
    }
}
