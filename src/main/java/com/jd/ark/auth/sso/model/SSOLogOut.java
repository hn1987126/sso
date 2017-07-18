package com.jd.ark.auth.sso.model;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenyi9 on 2017/7/17.
 */
public class SSOLogOut {

    public static void Quit(HttpServletRequest request, HttpServletResponse response, String returnUrl) throws IOException {
        response.sendRedirect("http://ssa.jd.com/sso/logout?ReturnUrl="+returnUrl);
    }

}
