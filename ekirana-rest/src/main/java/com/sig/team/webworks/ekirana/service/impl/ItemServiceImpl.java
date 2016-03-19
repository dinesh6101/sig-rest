package com.sig.team.webworks.ekirana.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sig.team.webworks.ekirana.crud.entity.Items;
import com.sig.team.webworks.ekirana.dao.ItemDAO;
import com.sig.team.webworks.ekirana.model.CustomerOrderTotal;
import com.sig.team.webworks.ekirana.model.ItemCategoryId;
import com.sig.team.webworks.ekirana.model.ItemsInfo;
import com.sig.team.webworks.ekirana.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Resource
	private ItemDAO itemDao;

	@Override
	public List<String> getDistinctUnit() {
		return itemDao.getDistinctUnit();
	}

	@Override
	public boolean isGetGroceryCategoyExist(String grocerycategoryname) {
		return itemDao.isGetGroceryCategoyExist(grocerycategoryname);
	}

	@Override
	public boolean isGetItemCategoryExist(String itemcategoryname) {
		return itemDao.isGetItemCategoryExist(itemcategoryname);
	}
	
	@Override
	public boolean isGetItemTypeExist(String itemtypename) {
		return itemDao.isGetItemTypeExist(itemtypename);
	}


	@Override
	public boolean isGetBrandExist(String brandname) {
		return itemDao.isGetBrandExist(brandname);
	}

	@Override
	public List<Items> searchItem(String apple) {
		return itemDao.searchItem(apple) ;
	}

	@Override
	public Items getItemsDetails(String grocerycategoryname,String itemcategoryname, String itemsname) {
		return itemDao.getItemsDetail(grocerycategoryname,itemcategoryname,itemsname);
	}

	@Override
	public ItemCategoryId getItemsName(ItemsInfo entity) {
		return itemDao.getItemsName(entity);
	}

	@Override
	public CustomerOrderTotal getOrderTotal(Integer customerid) {
		return itemDao.getOrderTotal(customerid);
	}

	

	
}
