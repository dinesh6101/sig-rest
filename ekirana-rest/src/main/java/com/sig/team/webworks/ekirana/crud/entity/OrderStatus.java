/*
 * Created on 18 Oct 2015 ( Time 18:29:35 )
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
 * Persistent class for entity stored in table "order_status"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="order_status")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="OrderStatus.countAll", query="SELECT COUNT(x) FROM OrderStatus x" )
} )
public class OrderStatus implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="status", length=999)
    private String     status       ;

    @Column(name="smsTemplate", length=999)
    private String     smstemplate  ;

    @Column(name="emailTemplate", length=999)
    private String     emailtemplate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdOn", nullable=false)
    private Date       createdon    ;

    @Column(name="createdBy", length=999)
    private String     createdby    ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updatedOn", nullable=false)
    private Date       updatedon    ;

    @Column(name="updatedBy", length=999)
    private String     updatedby    ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public OrderStatus()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : status ( VARCHAR ) 
    public void setStatus( String status )
    {
        this.status = status;
    }
    public String getStatus()
    {
        return this.status;
    }

    //--- DATABASE MAPPING : smsTemplate ( VARCHAR ) 
    public void setSmstemplate( String smstemplate )
    {
        this.smstemplate = smstemplate;
    }
    public String getSmstemplate()
    {
        return this.smstemplate;
    }

    //--- DATABASE MAPPING : emailTemplate ( VARCHAR ) 
    public void setEmailtemplate( String emailtemplate )
    {
        this.emailtemplate = emailtemplate;
    }
    public String getEmailtemplate()
    {
        return this.emailtemplate;
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
        sb.append(id);
        sb.append("]:"); 
        sb.append(status);
        sb.append("|");
        sb.append(smstemplate);
        sb.append("|");
        sb.append(emailtemplate);
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