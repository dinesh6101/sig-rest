package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the state database table.
 * 
 */
@Entity
@NamedQuery(name = "State.findAll", query = "SELECT s FROM State s")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stateId;

	private Integer countryId;

	private String statetName;

	public State() {
	}

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getStatetName() {
		return this.statetName;
	}

	public void setStatetName(String statetName) {
		this.statetName = statetName;
	}

}