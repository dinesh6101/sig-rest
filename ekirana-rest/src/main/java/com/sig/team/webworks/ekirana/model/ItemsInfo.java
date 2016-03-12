package com.sig.team.webworks.ekirana.model;

import java.util.List;

public class ItemsInfo {

	private List<String> groceryCategoryName;
	private List<String> itemCategoryName;
	private List<String> itemName;

	public List<String> getGroceryCategoryName() {
		return groceryCategoryName;
	}

	public void setGroceryCategoryName(List<String> groceryCategoryName) {
		this.groceryCategoryName = groceryCategoryName;
	}

	public List<String> getItemCategoryName() {
		return itemCategoryName;
	}

	public void setItemCategoryName(List<String> itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	public List<String> getItemName() {
		return itemName;
	}

	public void setItemName(List<String> itemName) {
		this.itemName = itemName;
	}

}
