


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
 * Persistent class for entity stored in table "item_category"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="item_type")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ItemType.countAll", query="SELECT COUNT(x) FROM ItemType x" )
} )
public class ItemType implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="itemTypeId", nullable=false)
    private Integer    itemtypeid ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="itemCategoryId", nullable=false)
    private Integer    itemcategoryid ;

    @Column(name="groceryCategoryId", nullable=false, length=255)
    private Integer     grocerycategoryid ;
    
    @Column(name="itemTypeName", nullable=false, length=255)
    private String     itemtypename ;

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



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ItemType()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setItemtypeid( Integer itemtypeid )
    {
        this.itemtypeid = itemtypeid ;
    }
    public Integer getItemtypeid()
    {
        return this.itemtypeid;
    }
    
    public void setItemCategoryid( Integer itemcategoryid )
    {
        this.itemcategoryid = itemcategoryid ;
    }
    public Integer getItemcategoryid()
    {
        return this.itemcategoryid;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : groceryCategoryId ( INT ) 
    public void setGrocerycategoryid( Integer grocerycategoryid )
    {
        this.grocerycategoryid = grocerycategoryid;
    }
    public Integer getGrocerycategoryid()
    {
        return this.grocerycategoryid;
    }

    //--- DATABASE MAPPING : itemCategoryName ( VARCHAR ) 
    public void setItemtypename( String itemtypename )
    {
        this.itemtypename = itemtypename;
    }
    public String getItemtypename()
    {
        return this.itemtypename;
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

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(itemtypeid);
        sb.append("]:"); 
        sb.append("["); 
        sb.append(itemcategoryid);
        sb.append("]:"); 
        sb.append(grocerycategoryid);
        sb.append("|");
        sb.append(itemtypename);
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