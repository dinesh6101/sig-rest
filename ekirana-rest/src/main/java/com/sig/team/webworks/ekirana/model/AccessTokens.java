package com.sig.team.webworks.ekirana.model;

import java.util.List;

import com.sig.team.webworks.ekirana.model.restsupport.RestResource;

public class AccessTokens implements RestResource{

	private static final long serialVersionUID = -7495814735334574914L;
	private List<String> tokens;

	public AccessTokens(List<String> tokens){
		this.tokens = tokens;
	}
	
	public List<String> getTokens(){
		return this.tokens;
	}

}
