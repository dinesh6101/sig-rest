package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prof_id")
	private int profId;

	private String bodyType;

	private String maritalStatus;

	private String name;

	private String physicalStatus;

	private String profCreator;

	private String skintone;

	public Profile() {
	}

	public int getProfId() {
		return this.profId;
	}

	public void setProfId(int profId) {
		this.profId = profId;
	}

	public String getBodyType() {
		return this.bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhysicalStatus() {
		return this.physicalStatus;
	}

	public void setPhysicalStatus(String physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getProfCreator() {
		return this.profCreator;
	}

	public void setProfCreator(String profCreator) {
		this.profCreator = profCreator;
	}

	public String getSkintone() {
		return this.skintone;
	}

	public void setSkintone(String skintone) {
		this.skintone = skintone;
	}

}