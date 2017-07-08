package com.fortnight.security_service.filter;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.filter.GenericFilterBean;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthFilter extends GenericFilterBean {
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		ObjectMapper mapper = new ObjectMapper();
		response.setCharacterEncoding("UTF-8");
		httpResponse.getWriter().write(mapper.writeValueAsString("INVALID LOGIN..."));

    }
}
