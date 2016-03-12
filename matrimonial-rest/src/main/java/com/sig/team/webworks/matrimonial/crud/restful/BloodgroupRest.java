package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.Bloodgroup;
import com.sig.team.webworks.matrimonial.crud.repository.BloodgroupRepository;

@RestController
public class BloodgroupRest {

	@Resource
	private BloodgroupRepository bloodgroupRepository;

	@RequestMapping(value = "/bloodgroup", method = RequestMethod.GET)
	public @ResponseBody Object bloodgroup() {
		return bloodgroupRepository.findAll();
	}

	@RequestMapping(value = "/bloodgroup/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return bloodgroupRepository.findOne(id);
	}

	@RequestMapping(value = "/bloodgroup/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		bloodgroupRepository.delete(id);
	}

	@RequestMapping(value = "/bloodgroup", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Bloodgroup entity) {
		return bloodgroupRepository.save(entity);
	}
	
}
