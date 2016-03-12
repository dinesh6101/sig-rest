package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.Country;
import com.sig.team.webworks.matrimonial.crud.repository.CountryRepository;

@RestController
public class CountryRest {

	@Resource
	private CountryRepository countryRepository;

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public @ResponseBody Object country() {
		return countryRepository.findAll();
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return countryRepository.findOne(id);
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		countryRepository.delete(id);
	}

	@RequestMapping(value = "/country", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Country entity) {
		return countryRepository.save(entity);
	}
	
}
