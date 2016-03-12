package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.Brand;
import com.sig.team.webworks.ekirana.crud.repository.BrandRepository;
import com.sig.team.webworks.rest.exception.RestException;

@RestController
public class BrandRest {

	@Resource
	private BrandRepository brandRepository;

	@RequestMapping(value = "/brand", method = RequestMethod.GET)
	public @ResponseBody Object brand() throws RestException {
		return brandRepository.findAll();
	}

	@RequestMapping(value = "/brand/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return brandRepository.findOne(id);
	}

	@RequestMapping(value = "/brand/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		brandRepository.delete(id);
	}

	@RequestMapping(value = "/brand", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Brand entity) throws RestException {
		return brandRepository.save(entity);
	}
	
}
