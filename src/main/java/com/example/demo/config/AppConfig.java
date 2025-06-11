package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user = User.builder().username("Ayush").password(passwordEncoder().encode("Ayushman")).roles("Admin").build();
        UserDetails user1 = User.builder().username("Akshay").password(passwordEncoder().encode("Chadani")).roles("Admin").build();

        return new InMemoryUserDetailsManager(user,user1);

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
//    @Bean
//    public Authentication authentication(AuthenticationConfiguration getAuthenticationConfiguration){
//        return  builder.getA
//    }

}
