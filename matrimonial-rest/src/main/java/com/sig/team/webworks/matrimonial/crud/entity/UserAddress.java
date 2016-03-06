package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_address database table.
 * 
 */
@Entity
@Table(name="user_address")
@NamedQuery(name="UserAddress.findAll", query="SELECT u FROM UserAddress u")
public class UserAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;

	private String address1;

	private String address2;

	public UserAddress() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

}