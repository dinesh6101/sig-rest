package com.sig.team.webworks.ekirana.model.restsupport.resources;

import org.codehaus.jackson.annotate.JsonIgnore;


public class RestErrorIgnoreMessage extends RestError {
	
	private static final long serialVersionUID = 2412716817908659239L;
	
	protected RestErrorIgnoreMessage(int errorCode, String errorType, String errorMessage, String i18nMessageKey, String messageKeys, String messageValues){
		super(errorCode, errorType, errorMessage, i18nMessageKey, messageKeys, messageValues);
	}
	
	protected RestErrorIgnoreMessage(int errorCode, String errorType, String errorMessage, String i18nMessageKey){
		super(errorCode, errorType, errorMessage, i18nMessageKey);
	}
	
	@Override
	@JsonIgnore
	public String getErrorMessage() {
		return super.getErrorMessage();
	}
}
