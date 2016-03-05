package com.sig.team.webworks.ekirana.dao;
import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
public interface ItemCountDAO {

	List<String> getItemCount();
	
	public List<GroceryCategory> getAllGroceryCategory();

	GroceryCategory getGroceryCategory(String categoryName);
}
