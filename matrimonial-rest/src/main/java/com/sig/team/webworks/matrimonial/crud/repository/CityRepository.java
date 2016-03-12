/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.matrimonial.crud.entity.City;



/**
 * @author Dinesh
 *
 */
@Repository
public interface CityRepository extends CrudRepository<City, Integer>, PagingAndSortingRepository<City, Integer>{

	

}