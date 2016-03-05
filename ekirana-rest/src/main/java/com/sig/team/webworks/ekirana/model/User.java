package com.sig.team.webworks.ekirana.model;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.sig.team.webworks.ekirana.model.restsupport.RestResource;

public class User implements RestResource {

	private static final long serialVersionUID = 1357037988654004793L;

	private Integer id;
	private Integer roleId;
	private String roleName;
	private String roleDescription;
	private Integer partnerId;
	private String name;
	private String username;
	private String password;
	private Integer acceptedAgreementId;
	private Date validBefore;
	private Date validAfter;
	private int failureCount;
	private String secretKey;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Integer getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAcceptedAgreementId() {
		return acceptedAgreementId;
	}

	public void setAcceptedAgreementId(Integer acceptedAgreementId) {
		this.acceptedAgreementId = acceptedAgreementId;
	}

	public Date getValidBefore() {
		return validBefore;
	}

	public void setValidBefore(Date validBefore) {
		this.validBefore = validBefore;
	}

	public Date getValidAfter() {
		return validAfter;
	}

	public void setValidAfter(Date validAfter) {
		this.validAfter = validAfter;
	}

	@JsonIgnore
	public int getFailureCount() {
		return failureCount;
	}

	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}

	@JsonIgnore
	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	//@CacheKeyMethod
	@JsonIgnore
	public String getcacheKey() {
		return this.username;
	}
}
