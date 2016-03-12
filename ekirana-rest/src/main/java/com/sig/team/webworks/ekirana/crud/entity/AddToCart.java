package com.sig.team.webworks.ekirana.crud.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import javax.persistence.*;

@Entity
@Table(name = "addto_cart")
// Define named queries here
@NamedQueries({
		@NamedQuery(name = "AddToCart.countAll", query = "SELECT COUNT(x) FROM AddToCart x")
})
public class AddToCart implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id", nullable = false)
	private Integer id;

	@Column(name = "userId", nullable = false)
	private Integer userid;

	@Column(name = "itemId", nullable = false)
	private Integer itemid;

	@Column(name = "ipAddress", nullable = false)
	private String ipaddress;

	@Column(name = "username")
	private String username;

	public AddToCart()
	{
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(id);
		sb.append("]:");
		sb.append(userid);
		sb.append("|");
		sb.append(itemid);
		sb.append("|");
		sb.append(ipaddress);
		sb.append("|");
		sb.append(username);
		return sb.toString();
	}
}
