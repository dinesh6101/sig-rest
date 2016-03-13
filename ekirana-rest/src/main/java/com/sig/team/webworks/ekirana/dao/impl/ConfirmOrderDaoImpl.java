package com.sig.team.webworks.ekirana.dao.impl;

import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.Queries;
import com.sig.team.webworks.ekirana.constants.OrderStatus;
import com.sig.team.webworks.ekirana.dao.ConfirmOrderDao;
 
@Repository
public class ConfirmOrderDaoImpl implements ConfirmOrderDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Integer updateConfirmOrder(Integer customerId) {
		return entityManager.createQuery(Queries.CONFIRM_ORDER)
				.setParameter("orderStatus", OrderStatus.ORDER_PLACED.toString())
				.setParameter("customerid", customerId)
				.setParameter("orderconfirmdate", new Date())				

				.executeUpdate();
	}
	@Override
	@Transactional
	public Integer updateCancelOrder(Integer customerId,String comments) {
		return entityManager.createQuery(Queries.CANCEL_ORDER)
				.setParameter("orderStatus", OrderStatus.ORDER_CANCELED.toString())
				.setParameter("customerid", customerId)
				.setParameter("comment", comments)
				.setParameter("ordercanceldate", new Date())				
				.executeUpdate();
	}
	
	 
	
}
