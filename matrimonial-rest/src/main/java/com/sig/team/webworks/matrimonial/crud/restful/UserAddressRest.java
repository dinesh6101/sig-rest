package com.sig.team.webworks.matrimonial.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.crud.entity.UserAddress;
import com.sig.team.webworks.matrimonial.crud.repository.UserAddressRepository;

@RestController
public class UserAddressRest {

	@Resource
	private UserAddressRepository userAddressRepository;

	@RequestMapping(value = "/userAddress", method = RequestMethod.GET)
	public @ResponseBody Object userAddress() {
		return userAddressRepository.findAll();
	}

	@RequestMapping(value = "/userAddress/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) {
		return userAddressRepository.findOne(id);
	}

	@RequestMapping(value = "/userAddress/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) {
		userAddressRepository.delete(id);
	}

	@RequestMapping(value = "/userAddress", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody UserAddress entity) {
		return userAddressRepository.save(entity);
	}
	
}
