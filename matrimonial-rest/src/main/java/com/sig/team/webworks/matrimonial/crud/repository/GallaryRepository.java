/*
 * Generated Dinesh
 */

package com.sig.team.webworks.matrimonial.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.matrimonial.crud.entity.Gallary;



/**
 * @author Dinesh
 *
 */
@Repository
public interface GallaryRepository extends CrudRepository<Gallary, Integer>, PagingAndSortingRepository<Gallary, Integer>{

	

}