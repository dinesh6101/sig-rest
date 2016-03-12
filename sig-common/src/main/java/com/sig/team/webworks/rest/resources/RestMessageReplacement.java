package com.sig.team.webworks.rest.resources;

import java.io.Serializable;

public class RestMessageReplacement implements Serializable {

	private static final long serialVersionUID = 3701916698188989064L;
	
	private String key;
	private String value;
	
	public RestMessageReplacement(String key, String value){
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
