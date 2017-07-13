package com.jd.ark.auth.sso.authentication;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.jd.ark.auth.sso.http.SimpleRestClient;
import com.jd.ark.auth.sso.model.DotnetAuthTicket;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.jd.ark.auth.sso.model.DotnetAuthenticationTicket;

public class CookieUtils {

	/*
	define("APP_CODE",   "IDC" );
	define("SAFETY_KEY", "Z5F8BG2A7JT2860T1400" );
	define("CURRENT_TIMESTAMP", date('Y-m-d%20H:i:s.000', time(true)));
	define("RESPONSE_FORMAT_BY_DEFAULT", "JSON");
	*/

	/**
	 * token较验
	 * @param url
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public static DotnetAuthTicket getSSOTicket(String url, String token)
			throws Exception {
		RestTemplate restTemplate = SimpleRestClient.getClient();
		long timestamp = System.currentTimeMillis()/1000;
		url = url + "?ticket={token}&url={jd}&ip={ip}";
		String result = restTemplate.getForObject(url, String.class, token, "jd", "ip");
		JSONObject data = JSONObject.parseObject(result);
		if (!data.getBoolean("REQ_FLAG")) {
			return null;
		}
		JSONObject user = data.getJSONObject("REQ_DATA");
		DotnetAuthTicket dotnetAuthTicket = new DotnetAuthTicket();
		dotnetAuthTicket.setUserId(user.getIntValue("userId"));
		dotnetAuthTicket.setFullname(user.getString("fullname"));
		dotnetAuthTicket.setEmail(user.getString("email"));
		dotnetAuthTicket.setMobile(user.getString("mobile"));
		dotnetAuthTicket.setPersonId(user.getString("personId"));
		dotnetAuthTicket.setOrgId(user.getString("orgId"));
		dotnetAuthTicket.setOrgName(user.getString("orgName"));
		dotnetAuthTicket.setUsername(user.getString("username"));
		dotnetAuthTicket.setExpire(user.getIntValue("expire"));
		return dotnetAuthTicket;
	}

	public static DotnetAuthenticationTicket getTicket(String url, String token, String secret, String appId)
			throws Exception {
		RestTemplate restTemplate = SimpleRestClient.getClient();
		long timestamp = System.currentTimeMillis()/1000;
		String reqStr = appId + "#" + secret + "#" + timestamp;
		String sign = md5(reqStr);
		url = url + "?app_id={appId}&sign={sign}&timestamp={timestamp}&token={token}";
		String result = restTemplate.getForObject(url, String.class, appId, sign, timestamp, token);
		JSONObject data = JSONObject.parseObject(result);
		if (data.getInteger("status") != 1) {
			return null;
		}
		JSONObject user = data.getJSONObject("data");
		DotnetAuthenticationTicket dotnetAuthenticationTicket = new DotnetAuthenticationTicket();
		dotnetAuthenticationTicket.setUser_id(user.getIntValue("user_id"));
		dotnetAuthenticationTicket.setUsername(user.getString("username"));
		dotnetAuthenticationTicket.setUsername_cn(user.getString("username_cn"));
		dotnetAuthenticationTicket.setDepart_node_id(user.getIntValue("depart_node_id"));
		dotnetAuthenticationTicket.setEmail_address(user.getString("email_address"));
		dotnetAuthenticationTicket.setMobile_phone_number(user.getString("mobile_phone_number"));
		dotnetAuthenticationTicket.setIm_account(user.getString("im_account"));
		return dotnetAuthenticationTicket;
	}

	public static String md5(String input) throws NoSuchAlgorithmException {
		String result = input;
		if (input != null) {
			MessageDigest md = MessageDigest.getInstance("MD5"); // or "SHA-1"
			md.update(input.getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			result = hash.toString(16);
			while (result.length() < 32) { // 40 for SHA-1
				result = "0" + result;
			}
		}
		return result;
	}
}
