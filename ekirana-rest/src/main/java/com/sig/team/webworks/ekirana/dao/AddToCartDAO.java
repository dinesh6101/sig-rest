package com.sig.team.webworks.ekirana.dao;

import java.util.List;

import com.sig.team.webworks.ekirana.crud.entity.AddToCart;

public interface AddToCartDAO /*extends CrudRepository<AddToCart, Integer>, PagingAndSortingRepository<AddToCart, Integer> */{

	AddToCart save(AddToCart entity);

	List<AddToCart> getCartData();

	Integer deleteCartByUserId(Integer userid);
}
