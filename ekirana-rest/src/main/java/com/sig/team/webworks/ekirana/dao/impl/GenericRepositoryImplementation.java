package com.sig.team.webworks.ekirana.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.dao.GenericRepositoryInterface;

@Repository
public class GenericRepositoryImplementation<T> implements GenericRepositoryInterface<T> {

	protected EntityManager entityManager;
	private Class<T> type;

	public GenericRepositoryImplementation() {
	}

	public GenericRepositoryImplementation(Class<T> type) {
		this.type = type;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public T save(T emp) {
		// TODO Auto-generated method stub
		entityManager.persist(emp);
		entityManager.flush();
		return emp;
	}

	@Override
	public Boolean delete(T emp) {
		// TODO Auto-generated method stub
		try {
			entityManager.remove(emp);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	@Override
	public T edit(T emp) {
		// TODO Auto-generated method stub
		try {
			return entityManager.merge(emp);
		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public T find(Long empId) {
		// TODO Auto-generated method stub
		return null;// (T)entityManager.find(Employee.class, empId);
	}
}
