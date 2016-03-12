package com.sig.team.webworks.rest.resources;

import java.util.Collection;

import com.sig.team.webworks.rest.RestResource;

public class RestCollection implements RestResource{
	
	private static final long serialVersionUID = 4471966653577905457L;
	
	private String resourceLocation;
	private Collection<RestResource> data;
	
	public RestCollection(){}
	
	public RestCollection(Collection<RestResource> data, String resourceLocation){
		this.data = data;
		this.resourceLocation = resourceLocation;
	}
	
	public Collection<RestResource> getData() {
		return data;
	}
	
	public void setData(Collection<RestResource> data) {
		this.data = data;
	}

	public String getResourceLocation() {
		return resourceLocation;
	}

}
