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
 * Persistent class for entity stored in table "customer_order"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="customer_order")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="CustomerOrder.countAll", query="SELECT COUNT(x) FROM CustomerOrder x" )
} )
public class CustomerOrder implements Serializable
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
    @Column(name="customerId")
    private Integer    customerid   ;

    @Column(name="itemId")
    private Integer    itemid       ;

    @Column(name="quantity")
    private Float      quantity     ;
    
    @Column(name="orderStatus", length=50)
    private String     orderStatus    ;

    @Column(name="orderTrackId")
    private Integer    ordertrackid ;

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
    
    @Column(name="comments", length=90)
    private String     comment    ;
    
    @Column(name="orderConfimDate", length=90)
    private String  orderconfirmdate    ;

    
    public String getOrderconfirmdate() {
		return orderconfirmdate;
	}

	public void setOrderconfirmdate(String orderconfirmdate) {
		this.orderconfirmdate = orderconfirmdate;
	}


	@Column(name="orderCancelDate", length=90)
    private String  ordercanceldate    ;


    

    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    public String getOrdercanceldate() {
		return ordercanceldate;
	}

	public void setOrdercanceldate(String ordercanceldate) {
		this.ordercanceldate = ordercanceldate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	//----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public CustomerOrder()
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
    //--- DATABASE MAPPING : customerId ( INT ) 
    public void setCustomerid( Integer customerid )
    {
        this.customerid = customerid;
    }
    public Integer getCustomerid()
    {
        return this.customerid;
    }

    //--- DATABASE MAPPING : itemId ( INT ) 
    public void setItemid( Integer itemid )
    {
        this.itemid = itemid;
    }
    public Integer getItemid()
    {
        return this.itemid;
    }

    //--- DATABASE MAPPING : quantity ( FLOAT ) 
    public void setQuantity( Float quantity )
    {
        this.quantity = quantity;
    }
    public Float getQuantity()
    {
        return this.quantity;
    }

    //--- DATABASE MAPPING : orderTrackId ( INT ) 
    public void setOrdertrackid( Integer ordertrackid )
    {
        this.ordertrackid = ordertrackid;
    }
    public Integer getOrdertrackid()
    {
        return this.ordertrackid;
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
        sb.append(customerid);
        sb.append("|");
        sb.append(itemid);
        sb.append("|");
        sb.append(quantity);
        sb.append("|");
        sb.append(ordertrackid);
        sb.append("|");
        sb.append(createdon);
        sb.append("|");
        sb.append(createdby);
        sb.append("|");
        sb.append(updatedon);
        // attribute 'updatedby' not usable (type = byte[])
        return sb.toString(); 
    } 

}