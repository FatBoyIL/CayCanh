package com.example.tree.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class securityConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User
                .builder()
                .username("khach")
                .password("{bcrypt}$2a$10$crY6jtm9YG1ztCzie2XcqOLj2hg4UQwnF8VipMFY67mBe/eKk1xFC")
                .roles("USER")
                .build();
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//                .roles("USER", "ADMIN")
//                .build();
        return new InMemoryUserDetailsManager(user);
    }
}
