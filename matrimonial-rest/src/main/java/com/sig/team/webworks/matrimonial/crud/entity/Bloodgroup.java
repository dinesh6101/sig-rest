package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bloodgroup database table.
 * 
 */
@Entity
@NamedQuery(name="Bloodgroup.findAll", query="SELECT b FROM Bloodgroup b")
public class Bloodgroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String bGroupName;

	public Bloodgroup() {
	}

	public String getBGroupName() {
		return this.bGroupName;
	}

	public void setBGroupName(String bGroupName) {
		this.bGroupName = bGroupName;
	}

}