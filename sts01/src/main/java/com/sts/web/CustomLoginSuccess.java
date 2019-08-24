package com.sts.web;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginSuccess implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		Collection<GrantedAuthority> list = (Collection<GrantedAuthority>) authentication.getAuthorities();
		for (GrantedAuthority tmp : list) {
			if (tmp.getAuthority().equals("ROLE_ADMIN")) {
				response.sendRedirect(request.getContextPath() + "/admin/mypage.do");
			} else if (tmp.getAuthority().equals("ROLE_TEACHER")) {
				response.sendRedirect(request.getContextPath() + "/teacher/mypage.do");
			} else if (tmp.getAuthority().equals("ROLE_STUDENT")) {
				response.sendRedirect(request.getContextPath() + "/student/mypage.do");
			}
		}

	}

}
