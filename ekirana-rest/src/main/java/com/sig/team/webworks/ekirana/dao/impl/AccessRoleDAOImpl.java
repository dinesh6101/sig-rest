package com.sig.team.webworks.ekirana.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sig.team.webworks.ekirana.crud.entity.AccessRoles;
import com.sig.team.webworks.ekirana.dao.AccessRoleDAO;

@Repository
@Transactional
public class AccessRoleDAOImpl implements AccessRoleDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public List<AccessRoles> getAllAccessRole() {
		List<AccessRoles> accessRoles = entityManager.createQuery("Select a From AccessRoles a", AccessRoles.class).getResultList();
		return accessRoles;
	}

}
