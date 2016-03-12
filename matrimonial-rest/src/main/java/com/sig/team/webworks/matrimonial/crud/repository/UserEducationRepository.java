/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.matrimonial.crud.entity.UserEducation;



/**
 * @author Dinesh
 *
 */
@Repository
public interface UserEducationRepository extends CrudRepository<UserEducation, Integer>, PagingAndSortingRepository<UserEducation, Integer>{

	

}