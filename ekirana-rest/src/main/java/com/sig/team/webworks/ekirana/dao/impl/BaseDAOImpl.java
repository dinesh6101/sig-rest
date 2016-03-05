package com.sig.team.webworks.ekirana.dao.impl;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sig.team.webworks.ekirana.dao.BaseDAO;

//import org.springframework.security.access.vote.AuthenticatedVoter;

public abstract class BaseDAOImpl implements BaseDAO {

	private static Logger LOGGER = Logger.getLogger(BaseDAOImpl.class);
	protected JdbcTemplate jdbcTemplate;

	protected void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	//	public void logAuditEvent(String message) {
	//		User currentUser = getCurrentUser();
	//		this.jdbcTemplate.update("INSERT INTO audittrail (userid, username, message, ts) VALUES (?, ?, ?, now())",
	//				new Object[] {currentUser.getId(),currentUser.getUsername(),message});
	//	}
}
