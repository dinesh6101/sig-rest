/*
 * Generated Dinesh
 */

package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.KartDetails;



/**
 * @author Dinesh
 *
 */
@Repository
public interface KartDetailsRepository extends CrudRepository<KartDetails, Integer>, PagingAndSortingRepository<KartDetails, Integer>{

	

}