package com.hello.www.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PermissionFilter implements Filter{

	//@SuppressWarnings("unused")
	//private String filterURL;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		//filterURL = filterConfig.getInitParameter("filterURL");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String requestURI = request.getRequestURI();
		System.out.println("Request URI: " + requestURI);
		chain.doFilter(request, response);
	}
	
	public void destroy() {
		
	}
	
}
