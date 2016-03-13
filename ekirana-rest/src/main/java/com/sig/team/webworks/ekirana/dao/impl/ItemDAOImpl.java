package com.sig.team.webworks.ekirana.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.Queries;
import com.sig.team.webworks.ekirana.crud.entity.Items;
import com.sig.team.webworks.ekirana.dao.ItemDAO;
import com.sig.team.webworks.ekirana.model.ItemCategoryId;
import com.sig.team.webworks.ekirana.model.ItemsInfo;
import com.sig.team.webworks.ekirana.model.KeyAndValues;
import com.sig.team.webworks.ekirana.util.StringUtil;

@Repository
public class ItemDAOImpl implements ItemDAO {

	@PersistenceContext
	private EntityManager entityManager;

	private static final Logger LOGGER = Logger.getLogger(ItemDAOImpl.class);

	@Override
	public List<String> getDistinctUnit() {

		String query = "SELECT distinct unit from Items";
		TypedQuery<String> typedQuery = entityManager.createQuery(query, String.class);
		List<String> results = typedQuery.getResultList();

		return results;
	}

	/*
	 * @Override public GroceryCategory getGroceryCategory(String categoryName) { javax.persistence.Query query = entityManager.createNamedQuery("GroceryCategory.getByName");
	 * query.setParameter("name", categoryName); return (GroceryCategory) query.getSingleResult(); }
	 */
	@Override
	public boolean isGetGroceryCategoyExist(String grocerycategoryname) {
		String query = "SELECT count(*) from GroceryCategory where grocerycategoryname like ?";
		TypedQuery<Long> typedQuery = entityManager.createQuery(query, Long.class).setParameter(1, grocerycategoryname);
		Long results = typedQuery.getSingleResult();

		if (results.intValue() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isGetItemCategoryExist(String itemcategoryname) {
		String query = "SELECT count(*) from ItemCategory where itemcategoryname like ?";
		TypedQuery<Long> typedQuery = entityManager.createQuery(query, Long.class).setParameter(1, itemcategoryname);
		Long results = typedQuery.getSingleResult();

		if (results.intValue() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isGetItemTypeExist(String itemtypename) {
		String query = "SELECT count(*) from ItemType where itemtypename like ?";
		TypedQuery<Long> typedQuery = entityManager.createQuery(query, Long.class).setParameter(1, itemtypename);
		Long results = typedQuery.getSingleResult();

		if (results.intValue() > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isGetBrandExist(String brandname) {
		String query = "SELECT count(*) from Brand where brandname like ?";
		TypedQuery<Long> typedQuery = entityManager.createQuery(query, Long.class).setParameter(1, brandname);
		Long results = typedQuery.getSingleResult();

		if (results.intValue() > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Items> searchItem(String name) {
		String query = "select count(*) from Items where itemcategoryid in (select itemcategoryid from ItemCategory where itemcategoryname "
				+ " like :name) or itemname "
				+ " like :name or itemsubname "
				+ " like :name or itemid in (select itemid from ItemBrand, Brand where ItemBrand.brandid = Brand.brandid and Brand.brandname "
				+ " like :name)";
		TypedQuery<Items> typedQuery = entityManager.createQuery(query, Items.class);
		typedQuery.setParameter("name", "%" + name + "%");
		List<Items> results = typedQuery.getResultList();
		return results;

	}

	@Override
	public Items getItemsDetail(String grocerycategoryname,
			String itemcategoryname, String itemsname) {
		String query = "select itemid from Items where grocerycategoryid in (select grocerycategoryid from GroceryCategory where grocerycategoryname "
				+ " like :?) or itemcategoryid in (select itemcategoryid from ItemCategory where itemcategoryname like :? "
				+ "itemid in (select itemid from Items where itemname like : ?)";
		TypedQuery<Items> typedQuery = entityManager.createQuery(query, Items.class);
		typedQuery.setParameter(1, grocerycategoryname);
		typedQuery.setParameter(2, itemcategoryname);
		typedQuery.setParameter(3, itemsname);
		Items results = typedQuery.getSingleResult();
		return results;
	}

	@Override
	public ItemCategoryId getItemsName(ItemsInfo entity) {
		ItemCategoryId itemsCategoryId = new ItemCategoryId();

		List<KeyAndValues> keyAndValuesList = new ArrayList<KeyAndValues>();
		for (String groceryCategoryName : entity.getGroceryCategoryName()) {
			String query = Queries.GROCERY_CATEGORY_ID_BY_NAME;
			Query typedQuery = entityManager.createQuery(query);
			typedQuery.setParameter("groceryCategoryName",
					StringUtil.replaceDash(groceryCategoryName));
			List<Object[]> queryResult = avoidNoResultExceptionForSingleResult(typedQuery);
			if (queryResult != null) {
				for (Object[] keyAndValues : queryResult) {
					KeyAndValues obj = new KeyAndValues();
					obj.setKey(Integer.parseInt(keyAndValues[0].toString()));
					obj.setValue(keyAndValues[1].toString());
					keyAndValuesList.add(obj);
				}
			}
		}

		List<KeyAndValues> itemCategryId = new ArrayList<KeyAndValues>();
		for (String itemCategoryName : entity.getItemCategoryName()) {
			String query = Queries.ITEM_CATEGORY_ID_BY_NAME;
			Query typedQuery = entityManager.createQuery(query);
			typedQuery.setParameter("itemCategoryName",
					StringUtil.replaceDash(itemCategoryName));
			List<Object[]> queryResult = avoidNoResultExceptionForSingleResult(typedQuery);
			if (queryResult != null) {
				for (Object[] keyAndValues : queryResult) {
					KeyAndValues obj = new KeyAndValues();
					obj.setKey(Integer.parseInt(keyAndValues[0].toString()));
					obj.setValue(keyAndValues[1].toString());
					itemCategryId.add(obj);
				}
			}
		}

		List<KeyAndValues> itemId = new ArrayList<KeyAndValues>();
		for (String itemname : entity.getItemName()) {
			String query = Queries.ITEM_ID_BY_NAME;
			Query typedQuery = entityManager.createQuery(query);
			typedQuery.setParameter("itemname",
					StringUtil.replaceDash(itemname));
			List<Object[]> queryResult = avoidNoResultExceptionForSingleResult(typedQuery);
			if (queryResult != null) {
				for (Object[] keyAndValues : queryResult) {
					KeyAndValues obj = new KeyAndValues();
					obj.setKey(Integer.parseInt(keyAndValues[0].toString()));
					obj.setValue(keyAndValues[1].toString());
					itemId.add(obj);
				}
			}
		}
		itemsCategoryId.setGroceryCategoryId(keyAndValuesList);
		itemsCategoryId.setItemCategryId(itemCategryId);
		itemsCategoryId.setItemId(itemId);
		return itemsCategoryId;
	}

	private List<Object[]> avoidNoResultExceptionForSingleResult(
			Query typedQuery) {
		try {
			List<Object[]> resultList = typedQuery.getResultList();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
