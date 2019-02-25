package com.example.demo.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/*
 * https://www.baeldung.com/spring-security-custom-authentication-failure-handler
 * 
 */
@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO 클라이언트에 에러정보 반환
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		response.sendRedirect("/member/login");

	}

}