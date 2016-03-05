package com.sig.team.webworks.ekirana.model.restsupport.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.sig.team.webworks.ekirana.model.restsupport.RestResource;
import com.sig.team.webworks.ekirana.model.restsupport.resources.AsyncRestResource;

public class AsyncRestResponse implements Serializable {
	
	private static final long serialVersionUID = 4471966653577905457L;
	private int httpStatusCode;
	private AsyncRestResource data;
	
	public AsyncRestResponse(){}
	
	public AsyncRestResponse(AsyncRestResource data){
		this.data = data;
		HttpStatus httpStatus = data.generateHttpStatus();
		if(httpStatus==null)
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		this.httpStatusCode = httpStatus.value();
	}
	
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public RestResource getData() {
		return data;
	}
}
