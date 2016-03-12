package com.sig.team.webworks.rest.exception;

import java.util.List;

import com.sig.team.webworks.rest.resources.RestError;

//Modified by Manoj after discussion with Amit
//RestException extends Exception and not RuntimeException
//- to make RestException a checked one
//- to make RestException cover non RuntimeException as well

//public abstract class RestException extends RuntimeException {
public abstract class RestException extends Exception {

	private static final long serialVersionUID = 457807495499446057L;
	private List<RestError> errors;

	@SuppressWarnings("unused")
	private RestException() {
	}

	@SuppressWarnings("unused")
	private RestException(String msg) {
	};

	public RestException(int errorCode, String errorType, String errorMessage, String i18nMessageKey, String messageKeys, String messageValues) {
		super(errorMessage);
	}

	public RestException(int errorCode, String errorType, String errorMessage, String i18nMessageKey) {
		super(errorMessage);
	}

	public RestException(int errorCode, String errorType, String i18nMessageKey, String messageKeys, String messageValues, Exception e) {
		super(e.getMessage());
	}

	public List<RestError> getErrors() {
		return errors;
	}

	public void addMessageReplacement(String key, String value, int index) {
		RestError error = errors.get(index);
		error.addMessageReplacement(key, value);
	}

	public int getCommonErrorCode() {
		if (errors != null && errors.size() > 0) {
			return errors.get(0).getErrorCode();
		} else {
			return -1;
		}
	}
}
