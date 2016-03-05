package com.sig.team.webworks.ekirana.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
import com.sig.team.webworks.ekirana.dao.ItemCountDAO;

@Repository
public class ItemCountDAOImpl implements ItemCountDAO {
	@PersistenceContext
	private EntityManager entityManager;

	private static final Logger LOGGER = Logger.getLogger(ItemCountDAOImpl.class);

	@Override
	public List<String> getItemCount() {

		String query = "select i.itemCategoryId, ic.itemCategoryName,  count(i.itemCategoryId) from item_Category as ic , items as i  where i.itemCategoryId = ic.itemCategoryId  group by i.itemCategoryId";
		TypedQuery<String> typedQuery = entityManager.createQuery(query, String.class);
		List<String> results = typedQuery.getResultList();

		return results;
	}

	@Override
	public List<GroceryCategory> getAllGroceryCategory() {

		Query query = entityManager.createNamedQuery("GroceryCategory.countAll");
		@SuppressWarnings("unchecked")
		List<GroceryCategory> groceryCategoriesy = query.getResultList();

		//set count 
		if (groceryCategoriesy != null) {
			for (GroceryCategory gc : groceryCategoriesy) {
				TypedQuery<Integer> countQuery = entityManager.createQuery("select  count(i.itemid)  from items i where i.groceryCategoryid = ?1 ", Integer.class);
				countQuery.setParameter(1, gc.getGrocerycategoryid());
				Integer results = countQuery.getSingleResult();
				gc.setItemCount(results);
			}
		}

		return groceryCategoriesy;
	}

	public GroceryCategory getGroceryCategory(String categoryName) {
		javax.persistence.Query query = entityManager.createNamedQuery("GroceryCategory.getByName");
		query.setParameter("name", categoryName);
		return (GroceryCategory) query.getSingleResult();
	}

}
