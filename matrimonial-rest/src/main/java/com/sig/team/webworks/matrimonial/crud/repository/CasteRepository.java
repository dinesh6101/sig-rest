/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sig.team.webworks.matrimonial.crud.entity.Caste;



/**
 * @author Dinesh
 *
 */
@RepositoryRestResource
public interface CasteRepository extends CrudRepository<Caste, Integer>, PagingAndSortingRepository<Caste, Integer>{

	

}