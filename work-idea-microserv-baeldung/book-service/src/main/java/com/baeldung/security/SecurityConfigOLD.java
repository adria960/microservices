package com.baeldung.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
//@Configuration
public class SecurityConfigOLD extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal1(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("admin_role")
                .and()
                .withUser("GFG")
                .password("Helloword")
                .roles("student");
    }

    /*
      @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
    .inMemoryAuthentication()
    .withUser("user").password("password")
    .authorities("USER");
  }
  @EnableWebSecurity
public class SecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
      throws Exception {
        auth.inMemoryAuthentication().withUser("user")
          .password(passwordEncoder()
          .encode("password"))
          .roles("USER");
    }
}
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/books").permitAll()
                .antMatchers(HttpMethod.GET, "/books/*").permitAll()
             //   .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/books").permitAll()
                .antMatchers(HttpMethod.PATCH, "/books/*").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/books/*").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .csrf()
                .disable();
    }

    // Function to encode the password
    // assign to the particular roles.
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

