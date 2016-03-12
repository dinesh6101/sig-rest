package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.City;
import com.sig.team.webworks.matrimonial.crud.repository.CityRepository;

@RestController
public class CityRest {

	@Resource
	private CityRepository cityRepository;

	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public @ResponseBody Object city() {
		return cityRepository.findAll();
	}

	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return cityRepository.findOne(id);
	}

	@RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		cityRepository.delete(id);
	}

	@RequestMapping(value = "/city", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody City entity) {
		return cityRepository.save(entity);
	}
	
}
