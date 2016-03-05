package com.sig.team.webworks.ekirana.crud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the sign_up database table.
 * 
 */
@Entity
@Table(name="sign_up")
// Define named queries here
@NamedQueries ( {
@NamedQuery ( name="SignUp.countAll", query="SELECT COUNT(x) FROM SignUp x" )
} )	
public class SignUp implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Column(name="emailId", nullable=false)
	private String emailId;

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int signUpId;
    
    @Column(name="firstName", nullable=false)
	private String firstName;

    @Column(name="lastName", nullable=false)
	private String lastName;
    
    @Column(name="area", nullable=true)
    private String area;

    @Column(name="city")
	private String city;

   
    @Column(name="houseNo")
	private String houseNo;

    @Column(name="landMarks")
	private String landMarks;
	
    @Column(name="mobileNo")
	private int mobileNo;

    @Column(name="pinCode")
	private int pinCode;

    @Column(name="streetDetails")
	private String streetDetails;

	public SignUp() {
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSignUpId() {
		return this.signUpId;
	}

	public void setSignUpId(int signUpId) {
		this.signUpId = signUpId;
	}
	
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getHouseNo() {
		return this.houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	public String getLandMarks() {
		return this.landMarks;
	}

	public void setLandMarks(String landMarks) {
		this.landMarks = landMarks;
	}
	
	public int getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getStreetDetails() {
		return this.streetDetails;
	}

	public void setStreetDetails(String streetDetails) {
		this.streetDetails = streetDetails;
	}
	
	public String toString() { 
	        StringBuffer sb = new StringBuffer(); 
	        sb.append("["); 
	        sb.append(firstName);
	        sb.append("]:"); 
	        sb.append(lastName);
	        sb.append("|");
	        sb.append(emailId);
	        return sb.toString();

}
}