package com.jd.ark.auth.sso.http;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 * @title：基于jdk的spring的RestTemplate
 */
public class SimpleRestClient {

	private static RestTemplate restTemplate;

	static {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setReadTimeout(5000);
		requestFactory.setConnectTimeout(5000);
		// 添加转换器
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		messageConverters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
		restTemplate = new RestTemplate(messageConverters);
		restTemplate.setRequestFactory(requestFactory);
		restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
	}

	private SimpleRestClient() {
	}
	
	public static RestTemplate getClient() {
		return restTemplate;
	}
}