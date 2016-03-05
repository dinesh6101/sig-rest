package com.sig.team.webworks.ekirana.dao;

import javax.sql.DataSource;

import com.sig.team.webworks.ekirana.model.User;

public interface BaseDAO {
	abstract void setSpecificDataSource(DataSource dataSource);
	//public void logAuditEvent(String message);
	public User getCurrentUser();
}
