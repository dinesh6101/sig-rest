package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.AccessTokens;
import com.sig.team.webworks.ekirana.crud.repository.AccessTokensRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class AccessTokensRest {

	@Resource
	private AccessTokensRepository accessTokensRepository;

	@RequestMapping(value = "/accessTokens", method = RequestMethod.GET)
	public @ResponseBody Object accessTokens() throws RestException {
		return accessTokensRepository.findAll();
	}

	@RequestMapping(value = "/accessTokens/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return accessTokensRepository.findOne(id);
	}

	@RequestMapping(value = "/accessTokens/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		accessTokensRepository.delete(id);
	}

	@RequestMapping(value = "/accessTokens", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody AccessTokens entity) throws RestException {
		return accessTokensRepository.save(entity);
	}

}
