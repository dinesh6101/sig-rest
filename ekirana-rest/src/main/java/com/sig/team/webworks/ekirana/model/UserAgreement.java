package com.sig.team.webworks.ekirana.model;

import java.io.Serializable;

import com.sig.team.webworks.rest.RestResource;

public class UserAgreement implements RestResource, Serializable{
	
	private static final long serialVersionUID = -3765826430082892946L;
	
	private Integer agreementId;
	private String filename;
	
	public Integer getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(Integer id) {
		this.agreementId = id;
	}
   public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
