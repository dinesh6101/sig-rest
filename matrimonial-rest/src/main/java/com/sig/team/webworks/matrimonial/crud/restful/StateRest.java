package com.sig.team.webworks.matrimonial.crud.restful;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.State;
import com.sig.team.webworks.matrimonial.crud.repository.StateRepository;

@RestController
public class StateRest {

	@Resource
	private StateRepository stateRepository;

	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public @ResponseBody Object state() {
		return stateRepository.findAll();
	}

	@RequestMapping(value = "/state/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return stateRepository.findOne(id);
	}

	@RequestMapping(value = "/state/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		stateRepository.delete(id);
	}

	@RequestMapping(value = "/state", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody State entity) {
		return stateRepository.save(entity);
	}
	
}
