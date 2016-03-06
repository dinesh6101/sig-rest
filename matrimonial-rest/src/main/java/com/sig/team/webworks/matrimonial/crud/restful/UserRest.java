package com.sig.team.webworks.matrimonial.crud.restful;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.User;
import com.sig.team.webworks.matrimonial.crud.repository.UserRepository;

@RestController
public class UserRest {

	@Resource
	private UserRepository userRepository;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody Object user() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return userRepository.findOne(id);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		userRepository.delete(id);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody User entity) {
		return userRepository.save(entity);
	}
	
}
