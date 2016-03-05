package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.CustomerList;
import com.sig.team.webworks.ekirana.crud.repository.CustomerListRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class CustomerListRest {

	@Resource
	private CustomerListRepository customerListRepository;

	@RequestMapping(value = "/customerList", method = RequestMethod.GET)
	public @ResponseBody Object customerList() throws RestException {
		return customerListRepository.findAll();
	}

	@RequestMapping(value = "/customerList/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return customerListRepository.findOne(id);
	}

	@RequestMapping(value = "/customerList/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		customerListRepository.delete(id);
	}

	@RequestMapping(value = "/customerList", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody CustomerList entity) throws RestException {
		return customerListRepository.save(entity);
	}
	
}
