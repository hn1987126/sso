package com.jd.ark.auth.sso;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.ark.auth.sso.interceptor.LoginRequiredInterceptor;
import com.jd.ark.auth.sso.model.DotnetAuthTicket;
import com.jd.ark.auth.sso.model.DotnetAuthenticationTicket;
import com.jd.ark.auth.sso.model.TicketHolder;

public class LoginInterceptor extends LoginRequiredInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		DotnetAuthTicket ticket = TicketHolder.getTicket();
        if(ticket != null && ticket.getUsername() != null) {
            return true;
        } else {
            response.sendRedirect(getSsoLoginUrl());
            return false;
        }
	}
}
