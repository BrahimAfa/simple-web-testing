package com.mgt_amss.mgt_amss;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        super.configure(auth);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
                //.antMatchers("/admin/**").hasRole("ADMIN")
                //.antMatchers("/user/**").hasRole("USER")
                //.antMatchers("/worker/**").hasRole("WORKER")
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/")
                .loginProcessingUrl("/login");
              //  .defaultSuccessUrl("/homepage.html", true)
              //  .failureUrl("/login.html?error=true")
               // .failureHandler(authenticationFailureHandler())
              //  .and()
               // .logout()
              //  .logoutUrl("/perform_logout")
               // .deleteCookies("JSESSIONID")
              //  .logoutSuccessHandler(logoutSuccessHandler());
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {return NoOpPasswordEncoder.getInstance();}

}