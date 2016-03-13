package com.sig.team.webworks.ekirana.constants;

public enum OrderStatus {
	ADDED_IN_CART("ADDED_IN_CART"), ORDER_PLACED("ORDER_PLACED"), ORDER_CANCELED("ORDER_CANCELED");

	private final String name;

	private OrderStatus(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}

}
