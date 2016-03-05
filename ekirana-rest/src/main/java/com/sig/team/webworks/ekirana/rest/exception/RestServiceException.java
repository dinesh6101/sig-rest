package com.sig.team.webworks.ekirana.rest.exception;

import org.springframework.http.HttpStatus;

import static com.sig.team.webworks.ekirana.constants.RestConstants.*;

public class RestServiceException extends RestException {

	//Note - HttpStatus 500 - INTERNAL_SERVER_ERROR - belongs to category Server Error 5xx

	private static final long serialVersionUID = 457807495499446057L;

	public RestServiceException(String errorMessage, String i18nMessageKey, String messageKeys, String messageValues) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), ERROR_TYPE_REST_ISSUE, errorMessage, i18nMessageKey, messageKeys, messageValues);
	}

	public RestServiceException(Exception e, int errorCode, String errorType, String i18nMessageKey, String messageKeys, String messageValues) {
		super(errorCode, errorType, e.getMessage(), i18nMessageKey, messageKeys, messageValues);
	}

	public RestServiceException(String errorMessage, String i18nMessageKey) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), ERROR_TYPE_REST_ISSUE, errorMessage, i18nMessageKey);
	}

	public RestServiceException(Exception e, String i18nMessageKey) {
		super(HttpStatus.INTERNAL_SERVER_ERROR.value(), ERROR_TYPE_REST_ISSUE, e.getMessage(), i18nMessageKey);
	}

	// Start - Added by manoj, so that derived classes can provide http status and error type  
	// to override default values INTERNAL_SERVER_ERROR and ERROR_TYPE_REST_ISSUE

	public RestServiceException(int errorCode, String errorType, String errorMessage, String i18nMessageKey, String messageKeys, String messageValues) {
		super(errorCode, errorType, errorMessage, i18nMessageKey, messageKeys, messageValues);
	}

	public RestServiceException(int errorCode, String errorType, String errorMessage, String i18nMessageKey) {
		super(errorCode, errorType, errorMessage, i18nMessageKey);
	}

	public RestServiceException(int errorCode, String errorType, Exception e, String i18nMessageKey) {
		super(errorCode, errorType, e.getMessage(), i18nMessageKey);
	}

	// End - Added by manoj, so that derived classes can provide http status and error type
}
