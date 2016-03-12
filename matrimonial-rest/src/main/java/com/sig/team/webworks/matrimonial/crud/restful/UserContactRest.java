package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.UserContact;
import com.sig.team.webworks.matrimonial.crud.repository.UserContactRepository;

@RestController
public class UserContactRest {

	@Resource
	private UserContactRepository userContactRepository;

	@RequestMapping(value = "/userContact", method = RequestMethod.GET)
	public @ResponseBody Object userContact() {
		return userContactRepository.findAll();
	}

	@RequestMapping(value = "/userContact/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return userContactRepository.findOne(id);
	}

	@RequestMapping(value = "/userContact/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		userContactRepository.delete(id);
	}

	@RequestMapping(value = "/userContact", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody UserContact entity) {
		return userContactRepository.save(entity);
	}
	
}
