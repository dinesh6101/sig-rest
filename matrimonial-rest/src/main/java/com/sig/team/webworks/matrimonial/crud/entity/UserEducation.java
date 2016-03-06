package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_education database table.
 * 
 */
@Entity
@Table(name="user_education")
@NamedQuery(name="UserEducation.findAll", query="SELECT u FROM UserEducation u")
public class UserEducation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int educationId;

	private int eduSpecId;

	private int eduTypeId;

	public UserEducation() {
	}

	public int getEducationId() {
		return this.educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public int getEduSpecId() {
		return this.eduSpecId;
	}

	public void setEduSpecId(int eduSpecId) {
		this.eduSpecId = eduSpecId;
	}

	public int getEduTypeId() {
		return this.eduTypeId;
	}

	public void setEduTypeId(int eduTypeId) {
		this.eduTypeId = eduTypeId;
	}

}