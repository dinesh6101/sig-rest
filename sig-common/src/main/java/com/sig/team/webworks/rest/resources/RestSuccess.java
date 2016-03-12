package com.sig.team.webworks.rest.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sig.team.webworks.rest.RestResource;


public class RestSuccess implements RestResource {
	
	private static final long serialVersionUID = 2412716817908659239L;
	
	private String resourceLocation;
	private String message;
	private String type;
	private String i18nMessageKey;
	private List<RestMessageReplacement> restMessageReplacements;
	
	@SuppressWarnings("unused")
	private RestSuccess(){}
	
	public RestSuccess(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues){
		this.resourceLocation = resourceLocation;
		this.message = message;
		this.type = type;
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
	
	public RestSuccess(String resourceLocation, String type, String message, String i18nMessageKey){
		this.resourceLocation = resourceLocation;
		this.message = message;
		this.type = type;
		this.i18nMessageKey = i18nMessageKey;
	}
	
	
	public String getResourceLocation() {
		return resourceLocation;
	}

	public void setResourceLocation(String resourceLocation) {
		this.resourceLocation = resourceLocation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
