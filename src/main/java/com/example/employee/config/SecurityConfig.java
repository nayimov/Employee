//package com.example.employee.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
//        return security
//                .authorizeHttpRequests(auth -> {
//                    auth.requestMatchers("/api/employee").permitAll();
//                    auth.anyRequest().authenticated();
//                })
//                .oauth2Login(withDefaults())
//                .formLogin(withDefaults())
//                .build();
//    }
//}
