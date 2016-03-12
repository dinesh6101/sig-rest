package com.sig.team.webworks.ekirana.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.Items;

@Repository
public class GenericDaoImpl<O> {

	@PersistenceContext
	private EntityManager entityManager;

	/*public O execute(String query) {
		TypedQuery<Items> typedQuery = entityManager.createQuery(query, (Object) O.class);
		typedQuery.setParameter("name", "%" + name + "%");
		List<Items> results = typedQuery.getResultList();
		return results;
	}*/

}
