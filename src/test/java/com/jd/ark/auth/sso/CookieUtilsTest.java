package com.jd.ark.auth.sso;

import com.jd.ark.auth.sso.model.DotnetAuthTicket;
import org.junit.Test;

import com.jd.ark.auth.sso.authentication.CookieUtils;

import junit.framework.Assert;

public class CookieUtilsTest {

	@Test
	public void testGetTicket() throws Exception {
		DotnetAuthTicket ticket = CookieUtils.getSSOTicket("http://ssa.jd.com/sso/ticket/verifyTicket",
				"ee90fedd58de413bba60f5327b8fe059");
		Assert.assertNotNull(ticket);
		System.out.println(ticket);
	}
}
