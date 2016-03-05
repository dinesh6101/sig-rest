package com.sig.team.webworks.ekirana.model;

import java.util.List;

import com.sig.team.webworks.ekirana.model.restsupport.RestResource;

public class RoleAccessTokenIds implements RestResource {

	private static final long serialVersionUID = -7495814735334574914L;
	private Integer roleId;
	private List<Integer> tokenIds;

	public RoleAccessTokenIds(){}
	
	public RoleAccessTokenIds(Integer roleId, List<Integer> tids){
		this.roleId = roleId;
		this.tokenIds = tids;
	}
	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public List<Integer> getTokenIds() {
		return tokenIds;
	}

	public void setTokenIds(List<Integer> tokenIds) {
		this.tokenIds = tokenIds;
	}
}
