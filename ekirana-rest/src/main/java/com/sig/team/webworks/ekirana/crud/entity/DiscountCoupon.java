package com.sig.team.webworks.ekirana.crud.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persistent class for entity stored in table "discount_coupon"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name = "discount_coupon")
// Define named queries here
@NamedQueries({ @NamedQuery(name = "DiscountCoupon.countAll", query = "SELECT COUNT(x) FROM DiscountCoupon x") })
public class DiscountCoupon implements Serializable {

	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	// ----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;

	// ----------------------------------------------------------------------
	// ENTITY DATA FIELDS
	// ----------------------------------------------------------------------
	@Column(name = "coupon_code", nullable = false)
	private String couponCode;

	@Column(name = "offerInPercentage")
	private Integer offerinpercentage;

	@Column(name = "validFromDate")
	private Date validfromdate;

	@Column(name = "validToDate")
	private Date validtodate;

	@Column(name = "numberOfUsageAllowed")
	private Integer numberofusageallowed;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createOn")
	private Date createon;

	@Column(name = "createdBy", length = 999)
	private String createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedOn")
	private Date updatedon;

	@Column(name = "updateBy", length = 999)
	private String updateby;

	// ----------------------------------------------------------------------
	// ENTITY LINKS ( RELATIONSHIP )
	// ----------------------------------------------------------------------

	// ----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	// ----------------------------------------------------------------------
	public DiscountCoupon() {
		super();
	}

	// ----------------------------------------------------------------------
	// GETTER & SETTER FOR THE KEY FIELD
	// ----------------------------------------------------------------------
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	// ----------------------------------------------------------------------
	// GETTERS & SETTERS FOR FIELDS
	// ----------------------------------------------------------------------
	// --- DATABASE MAPPING : couponCode ( VARCHAR )
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponCode() {
		return couponCode;
	}

	// --- DATABASE MAPPING : offerInPercentage ( INT )
	public void setOfferinpercentage(Integer offerinpercentage) {
		this.offerinpercentage = offerinpercentage;
	}

	public Integer getOfferinpercentage() {
		return offerinpercentage;
	}

	// --- DATABASE MAPPING : validFromDate ( TIMESTAMP )
	public void setValidfromdate(Date validfromdate) {
		this.validfromdate = validfromdate;
	}

	public Date getValidfromdate() {
		return validfromdate;
	}

	// --- DATABASE MAPPING : validToDate ( TIMESTAMP )
	public void setValidtodate(Date validtodate) {
		this.validtodate = validtodate;
	}

	public Date getValidtodate() {
		return validtodate;
	}

	// --- DATABASE MAPPING : numberOfUsageAllowed ( INT )
	public void setNumberofusageallowed(Integer numberofusageallowed) {
		this.numberofusageallowed = numberofusageallowed;
	}

	public Integer getNumberofusageallowed() {
		return numberofusageallowed;
	}

	// --- DATABASE MAPPING : createOn ( TIMESTAMP )
	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	public Date getCreateon() {
		return createon;
	}

	// --- DATABASE MAPPING : createdBy ( VARCHAR )
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getCreatedby() {
		return createdby;
	}

	// --- DATABASE MAPPING : updatedOn ( TIMESTAMP )
	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

	public Date getUpdatedon() {
		return updatedon;
	}

	// --- DATABASE MAPPING : updateBy ( VARCHAR )
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public String getUpdateby() {
		return updateby;
	}

	// ----------------------------------------------------------------------
	// toString METHOD
	// ----------------------------------------------------------------------

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(id);
		sb.append("]:");
		sb.append(couponCode);
		sb.append("|");
		sb.append(offerinpercentage);
		sb.append("|");
		sb.append(validfromdate);
		sb.append("|");
		sb.append(validtodate);
		sb.append("|");
		sb.append(numberofusageallowed);
		sb.append("|");
		sb.append(createon);
		sb.append("|");
		sb.append(createdby);
		sb.append("|");
		sb.append(updatedon);
		sb.append("|");
		sb.append(updateby);
		return sb.toString();
	}
}
