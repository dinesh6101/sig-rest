package com.sig.team.webworks.ekirana.model;

import java.util.List;

public class CustomerOrderTotal {

	private List<CustomersOrder> customersOrder;
	private String couponCode;
	private Double totalCost;
	private Integer orderTrackId;
	
	

	public Integer getOrderTrackId() {
		return orderTrackId;
	}

	public void setOrderTrackId(Integer orderTrackId) {
		this.orderTrackId = orderTrackId;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}


	public List<CustomersOrder> getCustomersOrder() {
		return customersOrder;
	}

	public void setCustomersOrder(List<CustomersOrder> customersOrder) {
		this.customersOrder = customersOrder;
	}

	
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	
}
