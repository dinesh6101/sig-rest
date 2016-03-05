package com.sig.team.webworks.ekirana.model.restsupport.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RestError implements Serializable {
	
	private static final long serialVersionUID = 2412716817908659239L;
	
	private int errorCode;
	private String errorMessage;
	private String errorType;
	private String i18nMessageKey;
	private List<RestMessageReplacement> restMessageReplacements;
	
	@SuppressWarnings("unused")
	private RestError(){}
	
	protected RestError(int errorCode, String errorType, String errorMessage, String i18nMessageKey, String messageKeys, String messageValues){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorType = errorType;
		this.i18nMessageKey = i18nMessageKey;
		if(messageKeys!=null && messageValues!=null){
			List<String> keys =  Arrays.asList(messageKeys.split("\\s*,\\s*"));
			List<String> values = Arrays.asList(messageValues.split("\\s*,\\s*"));
			if(keys!=null & values!=null){
				for(int i=0; i<keys.size(); i++){
					String key = keys.get(i);
					String value = values.get(i);
					addMessageReplacement(key,value);
				}
			}
		}
	}
	
	protected RestError(int errorCode, String errorType, String errorMessage, String i18nMessageKey){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorType = errorType;
		this.i18nMessageKey = i18nMessageKey;
	}
	
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getI18nMessageKey() {
		return i18nMessageKey;
	}
	public void setI18nMessageKey(String i18nMessageKey) {
		this.i18nMessageKey = i18nMessageKey;
	}

	public List<RestMessageReplacement> getMessageReplacements() {
		return this.restMessageReplacements;
	}

	public void addMessageReplacement(String key, String value) {
		if(this.restMessageReplacements==null){
			this.restMessageReplacements = new ArrayList<RestMessageReplacement>();
		}
		RestMessageReplacement restMessageReplacement = new RestMessageReplacement(key,value);
		this.restMessageReplacements.add(restMessageReplacement);
	}
}
