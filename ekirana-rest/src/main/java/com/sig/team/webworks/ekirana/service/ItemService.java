package com.sig.team.webworks.ekirana.service;

import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.Items;
import com.sig.team.webworks.ekirana.model.CustomersOrder;
import com.sig.team.webworks.ekirana.model.ItemCategoryId;
import com.sig.team.webworks.ekirana.model.ItemsInfo;

public interface ItemService {

	List<Items> searchItem(String name);

	List<String> getDistinctUnit();

	/* GroceryCategory getGroceryCategory(String categoryName); */

	boolean isGetGroceryCategoyExist(String grocerycategoryname);

	boolean isGetItemCategoryExist(String itemcategoryname);

	boolean isGetItemTypeExist(String itemtypename);

	boolean isGetBrandExist(String brandname);

	Items getItemsDetails(String grocerycategoryname, String itemcategoryname, String itemsname);

	ItemCategoryId getItemsName(ItemsInfo entity);

	List<CustomersOrder> getOrderTotal(Integer customerid);

}
