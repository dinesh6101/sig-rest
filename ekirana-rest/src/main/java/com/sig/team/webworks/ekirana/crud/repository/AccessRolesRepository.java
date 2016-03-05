/*
 * Generated Dinesh
 */

package com.sig.team.webworks.ekirana.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sig.team.webworks.ekirana.crud.entity.AccessRoles;

/**
 * @author Dinesh
 *
 */
@Repository("accessRolesRepository")
public interface AccessRolesRepository extends CrudRepository<AccessRoles, Integer>, PagingAndSortingRepository<AccessRoles, Integer> {

}