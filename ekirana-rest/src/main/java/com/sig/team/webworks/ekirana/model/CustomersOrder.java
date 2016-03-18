package com.sig.team.webworks.ekirana.model;

public class CustomersOrder {
	private Integer itemId;
	private Double  discountInPerentage;
	private Double  itemUnitPriceWithoutDiscount;
	private Double  itemUnitPriceWithDiscount;
	private Double  savedCost;

	
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Double getDiscountInPerentage() {
		return discountInPerentage;
	}

	public void setDiscountInPerentage(Double discountInPerentage) {
		this.discountInPerentage = discountInPerentage;
	}

	public Double getItemUnitPriceWithoutDiscount() {
		return itemUnitPriceWithoutDiscount;
	}

	public void setItemUnitPriceWithoutDiscount(Double itemUnitPriceWithoutDiscount) {
		this.itemUnitPriceWithoutDiscount = itemUnitPriceWithoutDiscount;
	}

	public Double getItemUnitPriceWithDiscount() {
		return itemUnitPriceWithDiscount;
	}

	public void setItemUnitPriceWithDiscount(Double itemUnitPriceWithDiscount) {
		this.itemUnitPriceWithDiscount = itemUnitPriceWithDiscount;
	}

	public Double getSavedCost() {
		return savedCost;
	}

	public void setSavedCost(Double savedCost) {
		this.savedCost = savedCost;
	}

	
}
