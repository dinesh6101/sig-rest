/*
 * Created on 18 Oct 2015 ( Time 18:29:34 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.sig.team.webworks.ekirana.crud.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "items"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name = "items")
// Define named queries here
@NamedQueries({
		@NamedQuery(name = "Items.countAll", query = "SELECT COUNT(x) FROM Items x")
})
public class Items implements Serializable
{
	private static final long serialVersionUID = 1L;

	//----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	//----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itemId", nullable = false)
	private Integer itemid;

	//----------------------------------------------------------------------
	// ENTITY DATA FIELDS 
	//----------------------------------------------------------------------    
	@Column(name = "groceryCategoryId", nullable = false)
	private Integer grocerycategoryid;

	@Column(name = "itemCategoryId", nullable = false)
	private Integer itemcategoryid;

	@Column(name = "itemSubName", length = 999)
	private String itemsubname;

	@Column(name = "itemName", nullable = false, length = 255)
	private String itemname;

	@Column(name = "unit", nullable = false)
	private String unit;

	@Column(name = "cost")
	private Float cost;

	@Column(name = "imageId")
	private Integer imageid;

	@Column(name = "itemDescription", length = 255)
	private String itemdescription;

	@Column(name = "rating")
	private Float rating;

	@Column(name = "message", length = 999)
	private String message;

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
	
	@Column(name = "itemTypeId")
	private Integer itemtypeid;

	//----------------------------------------------------------------------
	// ENTITY LINKS ( RELATIONSHIP )
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	//----------------------------------------------------------------------
	public Items()
	{
		super();
	}

	//----------------------------------------------------------------------
	// GETTER & SETTER FOR THE KEY FIELD
	//----------------------------------------------------------------------
	public void setItemid(Integer itemid)
	{
		this.itemid = itemid;
	}

	public Integer getItemid()
	{
		return this.itemid;
	}

	//----------------------------------------------------------------------
	// GETTERS & SETTERS FOR FIELDS
	//----------------------------------------------------------------------
	//--- DATABASE MAPPING : itemCategoryId ( INT ) 
	public void setItemcategoryid(Integer itemcategoryid)
	{
		this.itemcategoryid = itemcategoryid;
	}

	public Integer getItemcategoryid()
	{
		return this.itemcategoryid;
	}

	//--- DATABASE MAPPING : itemSubName ( VARCHAR ) 
	public void setItemsubname(String itemsubname)
	{
		this.itemsubname = itemsubname;
	}

	public String getItemsubname()
	{
		return this.itemsubname;
	}

	//--- DATABASE MAPPING : itemName ( VARCHAR ) 
	public void setItemname(String itemname)
	{
		this.itemname = itemname;
	}

	public String getItemname()
	{
		return this.itemname;
	}

	//--- DATABASE MAPPING : unit ( VARCHAR ) 
	public void setUnit(String unit)

	{
		this.unit = unit;
	}

	public String getUnit()
	{
		return this.unit;
	}

	//--- DATABASE MAPPING : cost ( FLOAT ) 
	public void setCost(Float cost)
	{
		this.cost = cost;
	}

	public Float getCost()
	{
		return this.cost;
	}

	//--- DATABASE MAPPING : imageId ( INT ) 
	public void setImageid(Integer imageid)
	{
		this.imageid = imageid;
	}

	public Integer getImageid()
	{
		return this.imageid;
	}

	//--- DATABASE MAPPING : itemDescription ( VARCHAR ) 
	public void setItemdescription(String itemdescription)
	{
		this.itemdescription = itemdescription;
	}

	public String getItemdescription()
	{
		return this.itemdescription;
	}

	//--- DATABASE MAPPING : rating ( FLOAT ) 
	public void setRating(Float rating)
	{
		this.rating = rating;
	}

	public Float getRating()
	{
		return this.rating;
	}

	//--- DATABASE MAPPING : message ( VARCHAR ) 
	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return this.message;
	}

	//--- DATABASE MAPPING : createOn ( TIMESTAMP ) 
	public void setCreateon(Date createon)
	{
		this.createon = createon;
	}

	public Date getCreateon()
	{
		return this.createon;
	}

	//--- DATABASE MAPPING : createdBy ( VARCHAR ) 
	public void setCreatedby(String createdby)
	{
		this.createdby = createdby;
	}

	public String getCreatedby()
	{
		return this.createdby;
	}

	//--- DATABASE MAPPING : updatedOn ( TIMESTAMP ) 
	public void setUpdatedon(Date updatedon)
	{
		this.updatedon = updatedon;
	}

	public Date getUpdatedon()
	{
		return this.updatedon;
	}

	//--- DATABASE MAPPING : updateBy ( VARCHAR ) 
	public void setUpdateby(String updateby)
	{
		this.updateby = updateby;
	}

	public String getUpdateby()
	{
		return this.updateby;
	}

	//----------------------------------------------------------------------
	// GETTERS & SETTERS FOR LINKS
	//----------------------------------------------------------------------

	public Integer getGrocerycategoryid() {
		return grocerycategoryid;
	}

	public void setGrocerycategoryid(Integer grocerycategoryid) {
		this.grocerycategoryid = grocerycategoryid;
	}

	public void setItemtypeid(Integer itemtypeid)
	{
		this.itemtypeid = itemtypeid;
	}

	public Integer getItemtypeid()
	{
		return this.itemtypeid;
	}

	//----------------------------------------------------------------------
	// toString METHOD
	//----------------------------------------------------------------------
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(itemid);
		sb.append("]:");
		sb.append(itemcategoryid);
		sb.append("|");
		sb.append(itemsubname);
		sb.append("|");
		sb.append(itemname);
		sb.append("|");
		sb.append(unit);
		sb.append("|");
		sb.append(cost);
		sb.append("|");
		sb.append(imageid);
		sb.append("|");
		sb.append(itemdescription);
		sb.append("|");
		sb.append(rating);
		sb.append("|");
		sb.append(message);
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