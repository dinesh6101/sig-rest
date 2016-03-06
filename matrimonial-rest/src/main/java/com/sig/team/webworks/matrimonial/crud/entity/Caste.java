package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the caste database table.
 * 
 */
@Entity
@NamedQuery(name="Caste.findAll", query="SELECT c FROM Caste c")
public class Caste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int casteId;

	private String casteName;

	private String subcaste1;

	private String subcaste2;

	public Caste() {
	}

	public int getCasteId() {
		return this.casteId;
	}

	public void setCasteId(int casteId) {
		this.casteId = casteId;
	}

	public String getCasteName() {
		return this.casteName;
	}

	public void setCasteName(String casteName) {
		this.casteName = casteName;
	}

	public String getSubcaste1() {
		return this.subcaste1;
	}

	public void setSubcaste1(String subcaste1) {
		this.subcaste1 = subcaste1;
	}

	public String getSubcaste2() {
		return this.subcaste2;
	}

	public void setSubcaste2(String subcaste2) {
		this.subcaste2 = subcaste2;
	}

}