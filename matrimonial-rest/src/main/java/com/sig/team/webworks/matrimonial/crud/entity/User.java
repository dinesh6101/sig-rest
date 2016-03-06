package com.sig.team.webworks.matrimonial.crud.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	private int addressId;

	private int age;

	private String bloodGroup;

	private String caste;

	private int cityId;

	private int contactId;

	private String countryId;

	private String diet;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String drinkHbt;

	private int educationId;

	private String emailId;

	private String firstName;

	private String gender;

	private String gothram;

	private float height;

	@Lob
	private byte[] images;

	private int income;

	private String lastName;

	private String loginStatus;

	private String maritalStatus;

	private String motherToung;

	private String occupation;

	private String religion;

	private String salary;

	private String smokeHbt;

	private String star;

	private int stateId;

	private float weight;

	private String zodiac;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCaste() {
		return this.caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDrinkHbt() {
		return this.drinkHbt;
	}

	public void setDrinkHbt(String drinkHbt) {
		this.drinkHbt = drinkHbt;
	}

	public int getEducationId() {
		return this.educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGothram() {
		return this.gothram;
	}

	public void setGothram(String gothram) {
		this.gothram = gothram;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public byte[] getImages() {
		return this.images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	public int getIncome() {
		return this.income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginStatus() {
		return this.loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMotherToung() {
		return this.motherToung;
	}

	public void setMotherToung(String motherToung) {
		this.motherToung = motherToung;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSmokeHbt() {
		return this.smokeHbt;
	}

	public void setSmokeHbt(String smokeHbt) {
		this.smokeHbt = smokeHbt;
	}

	public String getStar() {
		return this.star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getZodiac() {
		return this.zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

}