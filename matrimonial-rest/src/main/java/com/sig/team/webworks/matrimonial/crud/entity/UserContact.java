package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_contact database table.
 * 
 */
@Entity
@Table(name="user_contact")
@NamedQuery(name="UserContact.findAll", query="SELECT u FROM UserContact u")
public class UserContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contactId;

	private int contact1;

	private int contact2;

	public UserContact() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getContact1() {
		return this.contact1;
	}

	public void setContact1(int contact1) {
		this.contact1 = contact1;
	}

	public int getContact2() {
		return this.contact2;
	}

	public void setContact2(int contact2) {
		this.contact2 = contact2;
	}

}