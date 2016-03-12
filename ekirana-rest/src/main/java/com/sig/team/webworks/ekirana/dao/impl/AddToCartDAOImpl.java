package com.sig.team.webworks.ekirana.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.Queries;
import com.sig.team.webworks.ekirana.crud.entity.AddToCart;
import com.sig.team.webworks.ekirana.crud.repository.AddToCartRepository;
import com.sig.team.webworks.ekirana.dao.AddToCartDAO;

@Repository
public class AddToCartDAOImpl implements AddToCartDAO {

	private static final Logger LOGGER = Logger.getLogger(AddToCartDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Resource
	private AddToCartRepository addToCartRepository;

	@Override
	public AddToCart save(AddToCart entity) {
		return addToCartRepository.save(entity);
	}

	@Override
	public List<AddToCart> getCartData() {
		Query typedQuery = entityManager.createQuery(Queries.SELECT_ADD_TO_CART);
		List<AddToCart> results = typedQuery.getResultList();
		return results;
	}

	@Override
	@Transactional
	public Integer deleteCartByUserId(Integer userid) {
		Query typedQuery = entityManager.createQuery(Queries.CART_CART_BY_USER_ID);
		typedQuery.setParameter(1, userid);
		return typedQuery.executeUpdate();
	}

}
