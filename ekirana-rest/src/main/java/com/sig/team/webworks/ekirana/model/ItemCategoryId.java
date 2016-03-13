package com.sig.team.webworks.ekirana.model;

import java.util.List;

public class ItemCategoryId {

	private List<KeyAndValues> groceryCategoryId;
	private List<KeyAndValues> itemCategryId;
	private List<KeyAndValues> itemId;

	public List<KeyAndValues> getGroceryCategoryId() {
		return groceryCategoryId;
	}

	public void setGroceryCategoryId(List<KeyAndValues> groceryCategoryId) {
		this.groceryCategoryId = groceryCategoryId;
	}

	public List<KeyAndValues> getItemCategryId() {
		return itemCategryId;
	}

	public void setItemCategryId(List<KeyAndValues> itemCategryId) {
		this.itemCategryId = itemCategryId;
	}

	public List<KeyAndValues> getItemId() {
		return itemId;
	}

	public void setItemId(List<KeyAndValues> itemId) {
		this.itemId = itemId;
	}
}
