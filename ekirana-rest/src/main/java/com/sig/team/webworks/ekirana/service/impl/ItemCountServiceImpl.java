package com.sig.team.webworks.ekirana.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
import com.sig.team.webworks.ekirana.dao.ItemCountDAO;
import com.sig.team.webworks.ekirana.service.ItemCountService;

@Service
public class ItemCountServiceImpl implements ItemCountService {

	@Resource
	private ItemCountDAO itemCountDao;

	@Override
	public List<String> getItemCount() {
		return itemCountDao.getItemCount();
	}

	@Override
	public List<GroceryCategory> getAllGroceryCategory() {
		return itemCountDao.getAllGroceryCategory();
	}

	/*@Override
	public GroceryCategory getGroceryCategory(String categoryName) {
		return itemDao.getGroceryCategory(categoryName);
	}
*/
	
}
