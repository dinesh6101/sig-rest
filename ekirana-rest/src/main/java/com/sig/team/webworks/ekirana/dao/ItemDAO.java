package com.sig.team.webworks.ekirana.dao;

import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.Items;

public interface ItemDAO {

	List<String> getDistinctUnit();
	
	//GroceryCategory getGroceryCategory(String categoryName);

	boolean isGetGroceryCategoyExist(String grocerycategoryname);

	boolean isGetItemCategoryExist(String itemcategoryname);

	boolean isGetBrandExist(String brandname);

	boolean isGetItemTypeExist(String itemtypename);

	List<Items> searchItem(String name);

	
	Items getItemsDetail(String grocerycategoryname, String itemcategoryname,
			String itemsname);
	

}
