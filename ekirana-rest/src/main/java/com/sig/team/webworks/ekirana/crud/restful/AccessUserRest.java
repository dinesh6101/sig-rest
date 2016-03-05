package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.AccessUser;
import com.sig.team.webworks.ekirana.crud.repository.AccessUserRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class AccessUserRest {

	@Resource
	private AccessUserRepository accessUserRepository;

	@RequestMapping(value = "/accessUser", method = RequestMethod.GET)
	public @ResponseBody Object accessUser() throws RestException {
		return accessUserRepository.findAll();
	}

	@RequestMapping(value = "/accessUser/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return accessUserRepository.findOne(id);
	}

	@RequestMapping(value = "/accessUser/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		accessUserRepository.delete(id);
	}

	@RequestMapping(value = "/accessUser", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody AccessUser entity) throws RestException {
		return accessUserRepository.save(entity);
	}
	
}
