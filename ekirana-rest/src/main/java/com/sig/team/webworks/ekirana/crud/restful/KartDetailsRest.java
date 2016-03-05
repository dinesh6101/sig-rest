package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.KartDetails;
import com.sig.team.webworks.ekirana.crud.repository.KartDetailsRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class KartDetailsRest {

	@Resource
	private KartDetailsRepository kartDetailsRepository;

	@RequestMapping(value = "/kartDetails", method = RequestMethod.GET)
	public @ResponseBody Object kartDetails() throws RestException {
		return kartDetailsRepository.findAll();
	}

	@RequestMapping(value = "/kartDetails/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return kartDetailsRepository.findOne(id);
	}

	@RequestMapping(value = "/kartDetails/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		kartDetailsRepository.delete(id);
	}

	@RequestMapping(value = "/kartDetails", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody KartDetails entity) throws RestException {
		return kartDetailsRepository.save(entity);
	}
	
}
