/*
 * Generated Dinesh
 */

package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.Items;



/**
 * @author Dinesh
 *
 */
@Repository
public interface ItemsRepository extends CrudRepository<Items, Integer>, PagingAndSortingRepository<Items, Integer>{

	

}