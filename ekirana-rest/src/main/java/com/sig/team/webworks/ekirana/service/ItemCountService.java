package com.sig.team.webworks.ekirana.service;
import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
public interface ItemCountService {

	List<String> getItemCount();
	
	List<GroceryCategory> getAllGroceryCategory();
}
