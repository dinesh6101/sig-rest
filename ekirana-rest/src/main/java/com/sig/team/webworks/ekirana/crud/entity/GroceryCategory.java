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
 * Persistent class for entity stored in table "grocery_category"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="grocery_category")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="GroceryCategory.countAll", query="SELECT COUNT(x) FROM GroceryCategory x where x.grocerycategoryname= :name" ),
  @NamedQuery ( name="GroceryCategory.getByName", query="SELECT x FROM GroceryCategory x where x.grocerycategoryname= :name" )
} )
public class GroceryCategory implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="groceryCategoryId", nullable=false)
    private Integer    grocerycategoryid ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="groceryCategoryName", nullable=false, length=50)
    private String     grocerycategoryname ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdOn")
    private Date       createdon    ;

    @Column(name="createdBy", length=9999)
    private String     createdby    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updatedOn", nullable=false)
    private Date       updatedon    ;

    @Column(name="updatedBy", length=9999)
    private String     updatedby    ;

    @Transient
    private int itemCount;
    

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public GroceryCategory()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setGrocerycategoryid( Integer grocerycategoryid )
    {
        this.grocerycategoryid = grocerycategoryid ;
    }
    public Integer getGrocerycategoryid()
    {
        return this.grocerycategoryid;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : groceryCategoryName ( VARCHAR ) 
    public void setGrocerycategoryname( String grocerycategoryname )
    {
        this.grocerycategoryname = grocerycategoryname;
    }
    public String getGrocerycategoryname()
    {
        return this.grocerycategoryname;
    }

    //--- DATABASE MAPPING : createdOn ( TIMESTAMP ) 
    public void setCreatedon( Date createdon )
    {
        this.createdon = createdon;
    }
    public Date getCreatedon()
    {
        return this.createdon;
    }

    //--- DATABASE MAPPING : createdBy ( VARCHAR ) 
    public void setCreatedby( String createdby )
    {
        this.createdby = createdby;
    }
    public String getCreatedby()
    {
        return this.createdby;
    }

    //--- DATABASE MAPPING : updatedOn ( TIMESTAMP ) 
    public void setUpdatedon( Date updatedon )
    {
        this.updatedon = updatedon;
    }
    public Date getUpdatedon()
    {
        return this.updatedon;
    }

    //--- DATABASE MAPPING : updatedBy ( VARCHAR ) 
    public void setUpdatedby( String updatedby )
    {
        this.updatedby = updatedby;
    }
    public String getUpdatedby()
    {
        return this.updatedby;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	//----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(grocerycategoryid);
        sb.append("]:"); 
        sb.append(grocerycategoryname);
        sb.append("|");
        sb.append(createdon);
        sb.append("|");
        sb.append(createdby);
        sb.append("|");
        sb.append(updatedon);
        sb.append("|");
        sb.append(updatedby);
        return sb.toString(); 
    } 

}