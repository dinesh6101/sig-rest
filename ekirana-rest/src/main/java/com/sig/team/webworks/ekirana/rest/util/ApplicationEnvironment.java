package com.sig.team.webworks.ekirana.rest.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertiesFactoryBean;

public class ApplicationEnvironment extends PropertiesFactoryBean {

	private static final Logger logger = Logger.getLogger(ApplicationEnvironment.class);

	public String getProperty(String key) {
		try {
			Properties props = (Properties) super.getObject();
			if (props == null) {
				return null;
			} else {
				return props.getProperty(key);
			}
		} catch (IOException e) {
			logger.error("Property access exception: " + e.getLocalizedMessage(), e.fillInStackTrace());
			return null;
		}
	}
}
