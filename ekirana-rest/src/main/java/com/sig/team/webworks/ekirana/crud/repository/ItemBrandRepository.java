/*
 * Generated Dinesh
 */

package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.ItemBrand;



/**
 * @author Dinesh
 *
 */
@Repository
public interface ItemBrandRepository extends CrudRepository<ItemBrand, Integer>, PagingAndSortingRepository<ItemBrand, Integer>{

	

}