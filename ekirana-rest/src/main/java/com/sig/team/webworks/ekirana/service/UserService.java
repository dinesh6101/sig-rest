package com.sig.team.webworks.ekirana.service;

import com.sig.team.webworks.ekirana.model.AccessTokens;
import com.sig.team.webworks.ekirana.model.restsupport.resources.RestSuccess;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

public interface UserService {

	public AccessTokens getCurrentUsersAccessTokens() throws RestException;

	public RestSuccess changePassword(String userName, String oldPassword, String password, String verifyPassword) throws RestException;

	public RestSuccess changeEmailOrUsername(int userId, String oldValue, String newValue) throws RestException;

	public RestSuccess changeName(int userId, String oldName, String newName) throws RestException;

}
