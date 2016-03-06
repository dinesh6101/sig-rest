/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sig.team.webworks.matrimonial.crud.entity.Bloodgroup;



/**
 * @author Dinesh
 *
 */
@RepositoryRestResource
public interface BloodgroupRepository extends CrudRepository<Bloodgroup, Integer>, PagingAndSortingRepository<Bloodgroup, Integer>{

	

}