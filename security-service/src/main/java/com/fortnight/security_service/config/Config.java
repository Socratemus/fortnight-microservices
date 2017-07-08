package com.fortnight.security_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fortnight.security_service.filter.AuthFilter;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http
            .exceptionHandling()
            .and()
            .anonymous()
            .and()
            .servletApi()
            .and()
            .headers().cacheControl()
            //.and()
            //.addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class)
		;
		  
		http
            .authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/auth/login").permitAll()
			.anyRequest().authenticated()
       ;
	} 
	   
   	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
