package com.sig.team.webworks.ekirana.crud.restful;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.AccessRoles;
import com.sig.team.webworks.ekirana.crud.repository.AccessRolesRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
@Api(value = "AccessRolesRest")
public class AccessRolesRest {

	@Autowired
	private AccessRolesRepository accessRolesRepository;

	@ApiOperation(value = "Get Available Access Roles Of User", httpMethod = "GET", notes = "Fetch the available access roles", response = AccessRoles.class)
	@RequestMapping(value = "/accessRoles", method = RequestMethod.GET)
	public @ResponseBody Object accessRoles() throws RestException {
		return accessRolesRepository.findAll();
	}

	@RequestMapping(value = "/accessRoles/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return accessRolesRepository.findOne(id);
	}

	@RequestMapping(value = "/accessRoles/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		accessRolesRepository.delete(id);
	}

	@RequestMapping(value = "/accessRoles", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody AccessRoles entity) throws RestException {
		return accessRolesRepository.save(entity);
	}

}
