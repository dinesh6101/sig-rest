package com.sig.team.webworks.rest.resources;

import com.sig.team.webworks.rest.RestResource;

public class RestLocation implements RestResource{
	
	private static final long serialVersionUID = 3039755206622588755L;
	
	private String resourceLocation;
	
	public RestLocation(){}
	
	public RestLocation(String location){
		this.resourceLocation = location;
	}
	

	public String getResourceLocation() {
		return resourceLocation;
	}

	public void setResourceLocation(String resourceLocation) {
		this.resourceLocation = resourceLocation;
	}
}
