package com.sig.team.webworks.ekirana.config;

import javax.servlet.ServletException;

import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfigurer implements ServletContextInitializer {
	@Override
	public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
		servletContext.addFilter("corsFilter", new CORSFilter());
	}
}