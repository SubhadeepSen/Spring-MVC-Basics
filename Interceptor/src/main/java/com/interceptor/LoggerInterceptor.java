package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoggerInterceptor implements HandlerInterceptor {

	static Logger logger=Logger.getLogger(LoggerInterceptor.class);
	
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		logger.info("Pre-Handler");
		System.out.println("Pre-Handler");
		return true;
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView mv)
			throws Exception {
		logger.info("Post-Handler");
		System.out.println("Post-Handler");
	}

	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object obj, Exception ex)
			throws Exception {
		logger.info("After-Completion");
		System.out.println("After-Completion");

	}

}
