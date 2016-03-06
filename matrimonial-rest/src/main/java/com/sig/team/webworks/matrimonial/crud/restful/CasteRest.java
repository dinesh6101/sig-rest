package com.sig.team.webworks.matrimonial.crud.restful;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.Caste;
import com.sig.team.webworks.matrimonial.crud.repository.CasteRepository;

@RestController
public class CasteRest {

	@Resource
	private CasteRepository casteRepository;

	@RequestMapping(value = "/caste", method = RequestMethod.GET)
	public @ResponseBody Object caste() {
		return casteRepository.findAll();
	}

	@RequestMapping(value = "/caste/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return casteRepository.findOne(id);
	}

	@RequestMapping(value = "/caste/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		casteRepository.delete(id);
	}

	@RequestMapping(value = "/caste", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Caste entity) {
		return casteRepository.save(entity);
	}
	
}
