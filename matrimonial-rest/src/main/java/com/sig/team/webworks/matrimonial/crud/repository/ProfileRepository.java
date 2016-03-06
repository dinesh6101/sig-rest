/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sig.team.webworks.matrimonial.crud.entity.Profile;



/**
 * @author Dinesh
 *
 */
@RepositoryRestResource
public interface ProfileRepository extends CrudRepository<Profile, Integer>, PagingAndSortingRepository<Profile, Integer>{

	

}