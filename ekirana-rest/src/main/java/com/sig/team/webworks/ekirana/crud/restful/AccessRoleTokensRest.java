package com.sig.team.webworks.ekirana.crud.restful;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.AccessRoleTokens;
import com.sig.team.webworks.ekirana.crud.repository.AccessRoleTokensRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
@Api(value = "Access Role Tokens")
public class AccessRoleTokensRest {

	@Resource
	private AccessRoleTokensRepository accessRoleTokensRepository;

	@ApiOperation(value = "Get available access roles tokens of user", response = AccessRoleTokens.class)
	@RequestMapping(value = "/accessRoleTokens", method = RequestMethod.GET)
	public @ResponseBody Object accessRoleTokens() throws RestException {
		return accessRoleTokensRepository.findAll();
	}

	@RequestMapping(value = "/accessRoleTokens/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return accessRoleTokensRepository.findOne(id);
	}

	@RequestMapping(value = "/accessRoleTokens/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		accessRoleTokensRepository.delete(id);
	}

	@RequestMapping(value = "/accessRoleTokens", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody AccessRoleTokens entity) throws RestException {
		return accessRoleTokensRepository.save(entity);
	}
	
}
