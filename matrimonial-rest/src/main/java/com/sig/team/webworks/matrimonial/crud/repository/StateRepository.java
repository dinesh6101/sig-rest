/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.matrimonial.crud.entity.State;



/**
 * @author Dinesh
 *
 */
@Repository
public interface StateRepository extends CrudRepository<State, Integer>, PagingAndSortingRepository<State, Integer>{

	

}