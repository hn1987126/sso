package com.jd.ark.auth.sso.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jd.ark.auth.sso.authentication.CookieUtils;
import com.jd.ark.auth.sso.model.DotnetAuthTicket;
import com.jd.ark.auth.sso.model.TicketHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class DotnetTicketContextInterceptor extends HandlerInterceptorAdapter {

	private String appId = "sso.client.app.id";
	private String secret = "Z5F8BG2A7JT2860T1400";
	private String authUrl = "http://ssa.jd.com/sso/ticket/verifyTicket";
	private String cookieName = "sso.jd.com";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String loginToken = getTokenFromCookie(request);
		if (loginToken == null) {
			TicketHolder.remove();
			return true;
		}
		DotnetAuthTicket ticket = TicketHolder.getTicket();
		if (ticket == null || ticket.getUserId() == 0) {
			ticket = CookieUtils.getSSOTicket(authUrl, loginToken);
			TicketHolder.setTicket(ticket);
		}
		return true;
	}

	private String getTokenFromCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals(cookieName)) {
				return c.getValue();
			}
		}
		return null;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getAuthUrl() {
		return authUrl;
	}

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getCookieName() {
		return cookieName;
	}

	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}
	

}
