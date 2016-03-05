package com.sig.team.webworks.ekirana.model.restsupport.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.sig.team.webworks.ekirana.model.restsupport.RestResource;
import com.sig.team.webworks.ekirana.model.restsupport.resources.RestSuccess;
import com.sig.team.webworks.ekirana.model.restsupport.resources.RestSuccessWithConfigUpdate;

public class RestSuccessResponse implements Serializable {
	
	private static final long serialVersionUID = 4471966653577905457L;
	private int httpStatusCode;
	private RestSuccess data;
	
	public RestSuccessResponse(){}
	
	public RestSuccessResponse(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues, boolean isNewResource){
		this.data = new RestSuccess(resourceLocation, type, message, i18nMessageKey,messageKeys,messageValues);
		if(isNewResource){
			this.httpStatusCode = HttpStatus.CREATED.value();
		}else{
			this.httpStatusCode = HttpStatus.OK.value();
		}
	}
	
	/*public RestSuccessResponse(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues, ConfigUpdate configUpdate){
		this.data = new RestSuccessWithConfigUpdate(resourceLocation, type, message, i18nMessageKey,messageKeys,messageValues,configUpdate);
			this.httpStatusCode = HttpStatus.CREATED.value();
	}*/
	
	public RestSuccessResponse(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues, Integer configUpdateId, Integer xmlRowId){
		this.data = new RestSuccessWithConfigUpdate(resourceLocation, type, message, i18nMessageKey,messageKeys,messageValues, configUpdateId, xmlRowId);
			this.httpStatusCode = HttpStatus.CREATED.value();
	}
	
	public RestSuccessResponse(String resourceLocation, String type, String message, String i18nMessageKey, boolean isNewResource) {
		this.data = new RestSuccess(resourceLocation, type, message, i18nMessageKey);
		if(isNewResource){
			this.httpStatusCode = HttpStatus.OK.value();
		}else{
			this.httpStatusCode = HttpStatus.CREATED.value();
		}
	}
	
	public RestSuccessResponse(RestSuccess data) {
		this.httpStatusCode = HttpStatus.OK.value();
		this.data=data;
	}
	
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public RestResource getData() {
		return data;
	}
}
