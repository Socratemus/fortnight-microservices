package com.fortnight.security_service.filter;

import com.fortnight.security_service.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${fortnight.x-auth-token}")
    private String qualifier;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        //First we need to retrieve the token from the request...

        String token = httpServletRequest.getHeader(qualifier);

        System.out.println("Validating token ::" + token);


        //Then based on the token we need to validate the request...

        //Also maybe logging the request to database...

//        String username = "Jack";
//        UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//        //AFTER TOKEN VALIDATION
//        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//        logger.info("authenticated user " + username + ", setting security context");
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        //allow controller to hook into as well...
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
