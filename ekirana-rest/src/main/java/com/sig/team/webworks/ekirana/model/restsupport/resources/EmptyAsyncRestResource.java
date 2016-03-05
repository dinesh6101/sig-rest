package com.sig.team.webworks.ekirana.model.restsupport.resources;

public class EmptyAsyncRestResource extends AsyncRestResource {
	
	private static final long serialVersionUID = 1879503318016717784L;
	private String resourceLocation;
	
	public EmptyAsyncRestResource(String status, long retryAfter, String location) {
		super(status, retryAfter);
		this.resourceLocation = location;
	}
	
	@Override
	public void appendToResourceLocation(String tail) {
		this.resourceLocation = this.resourceLocation+tail;
	}
}
