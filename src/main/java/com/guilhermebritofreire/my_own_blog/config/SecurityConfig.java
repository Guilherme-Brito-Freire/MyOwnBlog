package com.guilhermebritofreire.my_own_blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.
                requestMatchers("/public/**").permitAll().
                requestMatchers("/").permitAll().
                requestMatchers("/auth/login").permitAll().
                requestMatchers("/logout").permitAll().
                requestMatchers("/article/**").permitAll().
                requestMatchers("/admin/**").hasRole("ADMIN")
                ).
                formLogin(form->form.loginPage("/auth/login").permitAll()).
                logout(withDefaults());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
