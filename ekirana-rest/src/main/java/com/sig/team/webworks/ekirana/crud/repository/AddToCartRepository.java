package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.AddToCart;

@Repository
public interface AddToCartRepository extends CrudRepository<AddToCart, Integer>, PagingAndSortingRepository<AddToCart, Integer> {

}
