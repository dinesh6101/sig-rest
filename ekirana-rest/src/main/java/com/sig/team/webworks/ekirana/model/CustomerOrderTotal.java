package com.sig.team.webworks.ekirana.model;

import java.util.List;

public class CustomerOrderTotal {

	private Integer customerId;
	private List<CustomersOrder> customersOrder;
	private Integer totalCalculatedWithoutCoupon;
	private String couponCode;
	private Integer totalCalculatedWithCoupon;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public List<CustomersOrder> getCustomersOrder() {
		return customersOrder;
	}

	public void setCustomersOrder(List<CustomersOrder> customersOrder) {
		this.customersOrder = customersOrder;
	}

	public Integer getTotalCalculatedWithoutCoupon() {
		return totalCalculatedWithoutCoupon;
	}

	public void setTotalCalculatedWithoutCoupon(Integer totalCalculatedWithoutCoupon) {
		this.totalCalculatedWithoutCoupon = totalCalculatedWithoutCoupon;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getTotalCalculatedWithCoupon() {
		return totalCalculatedWithCoupon;
	}

	public void setTotalCalculatedWithCoupon(Integer totalCalculatedWithCoupon) {
		this.totalCalculatedWithCoupon = totalCalculatedWithCoupon;
	}

}
