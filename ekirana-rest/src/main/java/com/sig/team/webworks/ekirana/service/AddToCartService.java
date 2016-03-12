package com.sig.team.webworks.ekirana.service;

import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.AddToCart;

public interface AddToCartService {

	AddToCart save(AddToCart entity);

	List<AddToCart> getCartData();

	Integer deleteCartByUserId(Integer userid);

}
