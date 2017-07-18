package com.jd.ark.auth.sso.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.ark.auth.sso.model.DotnetAuthTicket;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jd.ark.auth.sso.model.TicketHolder;

public class LoginRequiredInterceptor extends HandlerInterceptorAdapter {

	String ssoLoginUrl = "http://ssa.jd.com/sso/login";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		DotnetAuthTicket ticket = TicketHolder.getTicket();
		if (ticket == null) {
			return false;
		}
		return true;
	}

	public String getSsoLoginUrl() {
		return ssoLoginUrl;
	}

	public void setSsoLoginUrl(String ssoLoginUrl) {
		this.ssoLoginUrl = ssoLoginUrl;
	}
	
	
}
