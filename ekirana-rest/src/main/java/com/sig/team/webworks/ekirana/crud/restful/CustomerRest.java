package com.sig.team.webworks.ekirana.crud.restful;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.ekirana.crud.entity.Customer;
import com.sig.team.webworks.ekirana.crud.repository.CustomerRepository;
import com.sig.team.webworks.ekirana.rest.exception.RestException;

@RestController
public class CustomerRest {

	@Resource
	private CustomerRepository customerRepository;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public @ResponseBody Object customer() throws RestException {
		return customerRepository.findAll();
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getById(@PathVariable("id") Integer id) throws RestException {
		return customerRepository.findOne(id);
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Integer id) throws RestException {
		customerRepository.delete(id);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Customer entity) throws RestException {
		return customerRepository.save(entity);
	}
	
}
