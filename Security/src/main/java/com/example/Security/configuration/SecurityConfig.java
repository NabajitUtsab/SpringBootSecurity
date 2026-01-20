package com.example.Security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth->
                auth.requestMatchers("/public/**").permitAll().
                        anyRequest().authenticated() ) ///must need
                .formLogin(basic ->{})  ///must need
                .httpBasic(basic ->{})    // this is for postman login
                .csrf(csrf-> csrf.disable());

        return http.build();


    }
}
