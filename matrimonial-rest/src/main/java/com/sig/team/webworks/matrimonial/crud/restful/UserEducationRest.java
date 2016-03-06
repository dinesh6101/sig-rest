package com.sig.team.webworks.matrimonial.crud.restful;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.UserEducation;
import com.sig.team.webworks.matrimonial.crud.repository.UserEducationRepository;

@RestController
public class UserEducationRest {

	@Resource
	private UserEducationRepository userEducationRepository;

	@RequestMapping(value = "/userEducation", method = RequestMethod.GET)
	public @ResponseBody Object userEducation() {
		return userEducationRepository.findAll();
	}

	@RequestMapping(value = "/userEducation/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return userEducationRepository.findOne(id);
	}

	@RequestMapping(value = "/userEducation/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		userEducationRepository.delete(id);
	}

	@RequestMapping(value = "/userEducation", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody UserEducation entity) {
		return userEducationRepository.save(entity);
	}
	
}
