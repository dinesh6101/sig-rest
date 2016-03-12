package com.sig.team.webworks.ekirana.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sig.team.webworks.ekirana.crud.entity.AddToCart;
import com.sig.team.webworks.ekirana.dao.AddToCartDAO;
import com.sig.team.webworks.ekirana.service.AddToCartService;

@Service
public class AddToCartServiceImpl implements AddToCartService {

	@Resource
	private AddToCartDAO addToCartDAO;

	@Override
	public AddToCart save(AddToCart entity) {
		return addToCartDAO.save(entity);
	}

	@Override
	public List<AddToCart> getCartData() {
		return addToCartDAO.getCartData();
	}

	@Override
	public Integer deleteCartByUserId(Integer userid) {
		return addToCartDAO.deleteCartByUserId(userid);
	}

}
