package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.DiscountCoupon;

@Repository
public interface DiscountCouponRepository extends CrudRepository<DiscountCoupon, Integer>, PagingAndSortingRepository<DiscountCoupon, Integer>{	
	}
	
