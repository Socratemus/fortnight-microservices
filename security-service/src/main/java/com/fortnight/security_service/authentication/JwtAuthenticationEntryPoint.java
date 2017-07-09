package com.fortnight.security_service.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        // This is invoked when user tries to access a secured REST resource without supplying any credentials
        // We should just send a 401 Unauthorized response because there is no 'login page' to redirect to
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");

        ApiResponse apiResponse = new ApiResponse();

        apiResponse.StatusId = 100L;
        apiResponse.Message = "Access was denied";
        apiResponse.Code = "401 Unauthorized";

        ObjectMapper mapper = new ObjectMapper();

        response.getWriter().print(mapper.writeValueAsString(apiResponse));
        response.getWriter().flush();
    }

     class ApiResponse {

            public Long StatusId;

            public String Message;

            public String Code;
     }
}