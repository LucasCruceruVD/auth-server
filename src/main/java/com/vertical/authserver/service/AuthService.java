package com.vertical.authserver.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

@Service
public class AuthService implements UserDetailsService  {

    public UserDetails loadUserByUsername(String email) {
            //TODO IMPLEMENTATION
        return null;
    }
}
