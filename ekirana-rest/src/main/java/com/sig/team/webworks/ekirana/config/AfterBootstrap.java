package com.sig.team.webworks.ekirana.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class AfterBootstrap implements InitializingBean {

	private final Logger LOGGER = Logger.getLogger(AfterBootstrap.class);

	public void afterPropertiesSet() throws Exception {
		LOGGER.info("afterPropertiesSet");
	}

}